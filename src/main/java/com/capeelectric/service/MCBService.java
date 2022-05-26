/**
 * 
 */
package com.capeelectric.service;


import com.capeelectric.exception.MCBException;
import com.capeelectric.model.MCB;

/**
 * @author CAPE-SOFTWARE
 *
 */
public interface MCBService {
	
	public MCB addMCB(MCB mcb) throws MCBException ;

}
