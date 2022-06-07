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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capeelectric.exception.DiagramComponentException;
import com.capeelectric.model.DiagramComponent;
import com.capeelectric.model.DiagramSymbol;
import com.capeelectric.service.DiagramService;

@RestController
@RequestMapping("/api/diagram/v1")
public class DiagramController {

private static final Logger logger = LoggerFactory.getLogger(DiagramController.class);
	
	@Autowired
	private DiagramService diagramService;
	
	@PostMapping("/saveDiagram")
	public ResponseEntity<String> addDiagramComponent(@RequestBody DiagramComponent diagramComponent)
			throws DiagramComponentException {
		logger.info("called addBasicLpsDetails function UserName : {}", diagramComponent.getUserName());
		diagramService.addDiagram(diagramComponent);
		return new ResponseEntity<String>("Diagram saved successfully", HttpStatus.CREATED);
	}

	@GetMapping("/retrieveDiagram/{userName}/{fileName}")
	public ResponseEntity<DiagramComponent> retrieveDiagramComponent(@PathVariable String userName, @PathVariable String fileName) 
			throws DiagramComponentException {
		logger.info("called retrieveDiagramComponent function UserName: {}, fileName : {}", userName, fileName);
		return new ResponseEntity<DiagramComponent>(diagramService.retrieveDiagramComponent(userName, fileName),
				HttpStatus.OK);
	}
	
	@GetMapping("/retrievefileName/{userName}/{fileName}")
	public ResponseEntity<String> retrievefileName(@PathVariable String userName, @PathVariable String fileName) 
			throws DiagramComponentException {
		logger.info("called retrieveDiagramComponent function UserName: {}, fileName : {}", userName, fileName);
		return new ResponseEntity<String>(diagramService.retrieveFileName(userName, fileName),
				HttpStatus.OK);
	}
	
	@GetMapping("/retrieveDiagramList/{userName}")
	public ResponseEntity<List<DiagramComponent>> retrieveDiagramList(@PathVariable String userName) 
			throws DiagramComponentException {
		logger.info("called retrieveDiagramList function UserName: {}", userName);
		return new ResponseEntity<List<DiagramComponent>>(diagramService.retrieveAllDiagram(userName),
				HttpStatus.OK);
	}
	
	@PutMapping("/updateDiagram")
	public ResponseEntity<String> updateDiagramComponent(@RequestBody DiagramComponent diagramComponent)
			throws DiagramComponentException {
		logger.info("called updateDiagramComponent function UserName : {}", diagramComponent.getUserName());
		diagramService.updateDiagram(diagramComponent);
		return new ResponseEntity<String>("Diagram updated successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/symbolList")
	public ResponseEntity<List<DiagramSymbol>>symbolList() 
			throws DiagramComponentException {
		logger.info("called symbolList function");
		return new ResponseEntity<List<DiagramSymbol>>(diagramService.retrieveAllSymbol(),
				HttpStatus.OK);
	}
	
	
}
