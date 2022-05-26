/**
 * 
 */
package com.capeelectric.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capeelectric.exception.MCBException;
import com.capeelectric.model.MCB;
import com.capeelectric.service.MCBService;

/**
 * @author CAPE-SOFTWARE
 *
 */
@RestController
@RequestMapping("/api/diagram/v1")
public class MCBController {
private static final Logger logger = LoggerFactory.getLogger(MCBController.class);
	
	@Autowired
	private MCBService mcbService;
	
	@PostMapping("/saveMCB")
	public ResponseEntity<String> addMCB(@RequestBody MCB mcb)
			throws MCBException {
		logger.info("called addMCB function File Name : {}", mcb.getFileName());
		mcbService.addMCB(mcb);
		return new ResponseEntity<String>("MCB details saved successfully", HttpStatus.CREATED);
	}

//	@GetMapping("/retrieveDiagram/{userName}/{fileName}")
//	public ResponseEntity<DiagramComponent> retrieveDiagramComponent(@PathVariable String userName, @PathVariable String fileName) 
//			throws DiagramComponentException {
//		logger.info("called retrieveDiagramComponent function UserName: {}, fileName : {}", userName, fileName);
//		return new ResponseEntity<DiagramComponent>(diagramService.retrieveDiagramComponent(userName, fileName),
//				HttpStatus.OK);
//	}
//	
//	@PutMapping("/updateDiagram")
//	public ResponseEntity<String> updateDiagramComponent(@RequestBody DiagramComponent diagramComponent)
//			throws DiagramComponentException {
//		logger.info("called updateDiagramComponent function UserName : {}", diagramComponent.getUserName());
//		diagramService.updateDiagram(diagramComponent);
//		return new ResponseEntity<String>("Diagram updated successfully", HttpStatus.CREATED);
//	}

}
