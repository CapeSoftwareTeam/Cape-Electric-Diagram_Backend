/**
 * 
 */
package com.capeelectric.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capeelectric.exception.DiagramComponentException;
import com.capeelectric.model.DiagramComponent;
import com.capeelectric.repository.DiagramRepository;
import com.capeelectric.service.DiagramService;
import com.capeelectric.util.UserFullName;

/**
 * @author CAPE-SOFTWARE
 *
 */
@Service
public class DiagramServiceImpl implements DiagramService {
	private static final Logger logger = LoggerFactory.getLogger(DiagramServiceImpl.class);

	@Autowired
	private DiagramRepository diagramRepository;
	
	@Autowired
	private UserFullName userFullName;
	
	@Transactional
	@Override
	public DiagramComponent addDiagram(DiagramComponent diagramComponent) throws DiagramComponentException {
		logger.info("Called addDiagram function");
		
		if (diagramComponent != null && diagramComponent.getUserName() != null ) {
			//Optional<DiagramComponent> diagramComponentRepo = diagramRepository.findByUserNameAndDiagramId(diagramComponent.getUserName(),diagramComponent.getDiagramId());
			logger.debug("Basic Client Repo data available");
				//if(!basicLpsDetailsRepo.isPresent()) {
			diagramComponent.setCreatedDate(LocalDateTime.now());
			diagramComponent.setUpdatedDate(LocalDateTime.now());
			diagramComponent.setCreatedBy(userFullName.findByUserName(diagramComponent.getUserName()));
			diagramComponent.setUpdatedBy(userFullName.findByUserName(diagramComponent.getUserName()));
					logger.info("Ended addBasicLpsDetails function");
					return diagramRepository.save(diagramComponent);
				//}
//				else {
//					logger.error("Client name "+basicLps.getClientName()+" already exists");
//					throw new BasicLpsException("Client name "+basicLps.getClientName()+" already exists");
//				}
			
		} else {
			logger.error("Invalid Inputs");
			throw new DiagramComponentException("Invalid Inputs");
		}
		
	}
	
}
