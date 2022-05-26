/**
 * 
 */
package com.capeelectric.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capeelectric.exception.MCBException;
import com.capeelectric.model.MCB;
import com.capeelectric.repository.MCBRepository;
import com.capeelectric.service.MCBService;
import com.capeelectric.util.UserFullName;

/**
 * @author CAPE-SOFTWARE
 *
 */
@Service
public class MCBServiceImpl implements MCBService {
	private static final Logger logger = LoggerFactory.getLogger(MCBServiceImpl.class);

	@Autowired
	private MCBRepository mcbRepository;
	
	@Autowired
	private UserFullName userFullName;
	
	@Transactional
	@Override
	public MCB addMCB(MCB mcb) throws MCBException {
		logger.info("Called addMCB function");
		if (mcb != null && mcb.getFileName() != null ) {
			Optional<MCB> mcbRepo = mcbRepository.findByFileNameAndNodeId(mcb.getFileName(),mcb.getNodeId());
			
			if(!mcbRepo.isPresent()) {
				mcb.setCreatedDate(LocalDateTime.now());
				mcb.setUpdatedDate(LocalDateTime.now());
				mcb.setCreatedBy(userFullName.findByUserName(mcb.getUserName()));
				mcb.setUpdatedBy(userFullName.findByUserName(mcb.getUserName()));
				logger.info("Ended addMCB function");
				return mcbRepository.save(mcb);
			}
			else {
				logger.error("Node Id "+mcb.getNodeId()+"is already exist for File Name"+mcb.getFileName());
				throw new MCBException("Node Id "+mcb.getNodeId()+"is already exist for File Name"+mcb.getFileName());
			}						
		}
		else {
			logger.error("Invalid Inputs");
			throw new MCBException("Invalid Inputs");
		}	
	}
		
}
