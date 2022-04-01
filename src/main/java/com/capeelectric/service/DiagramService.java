package com.capeelectric.service;

import com.capeelectric.exception.BasicLpsException;
import com.capeelectric.exception.DiagramComponentException;
import com.capeelectric.model.DiagramComponent;

public interface DiagramService {

	public DiagramComponent addDiagram(DiagramComponent diagramComponent) throws DiagramComponentException;

}
