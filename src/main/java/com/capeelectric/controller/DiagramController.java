package com.capeelectric.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capeelectric.exception.DiagramComponentException;
import com.capeelectric.model.DiagramComponent;
import com.capeelectric.service.DiagramService;

@RestController
@RequestMapping("/api/diagram/v1")
public class DiagramController {

private static final Logger logger = LoggerFactory.getLogger(DiagramController.class);
	
	@Autowired
	private DiagramService diagramService;
	
	@PostMapping("/saveDiagram")
	public ResponseEntity<DiagramComponent> addDiagramComponent(@RequestBody DiagramComponent diagramComponent)
			throws DiagramComponentException {
		logger.info("called addBasicLpsDetails function UserName : {}", diagramComponent.getUserName());
		return new ResponseEntity<DiagramComponent>(diagramService.addDiagram(diagramComponent), HttpStatus.CREATED);
	}

//	@GetMapping("/retrieveBasicLps/{userName}/{basicLpsId}")
//	public ResponseEntity<List<BasicLps>> retrieveBasicLpsDetails(@PathVariable String userName,
//			@PathVariable Integer basicLpsId)
//			throws BasicLpsException {
//		logger.info("called retrieveBasicLpsDetails function UserName: {}, basicLpsId : {}", userName, basicLpsId);
//		return new ResponseEntity<List<BasicLps>>(basicLpsService.retrieveBasicLpsDetails(userName, basicLpsId),
//				HttpStatus.OK);
//	}
}
