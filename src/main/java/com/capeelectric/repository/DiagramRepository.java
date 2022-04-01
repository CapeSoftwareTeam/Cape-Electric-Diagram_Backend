/**
 * 
 */
package com.capeelectric.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capeelectric.model.DiagramComponent;

/**
 * @author CAPE-SOFTWARE
 *
 */
public interface DiagramRepository extends CrudRepository<DiagramComponent, Integer>{
	List<DiagramComponent> findByUserNameAndDiagramId(String userName, Integer diagramId);

	

}
