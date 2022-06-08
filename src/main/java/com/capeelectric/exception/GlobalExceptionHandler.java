package com.capeelectric.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capeelectric.util.ErrorMessage;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({ DiagramComponentException.class })
	public ResponseEntity<ErrorMessage> handleDiagramComponentException(DiagramComponentException e) {
		ErrorMessage exceptionMessage = new ErrorMessage(e.getMessage(), e.getLocalizedMessage(), "406");
		return new ResponseEntity<ErrorMessage>(exceptionMessage, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler({ MCBException.class })
	public ResponseEntity<ErrorMessage> handleMCBException(MCBException e) {
		ErrorMessage exceptionMessage = new ErrorMessage(e.getMessage(), e.getLocalizedMessage(), "406");
		return new ResponseEntity<ErrorMessage>(exceptionMessage, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler({ MCCBException.class })
	public ResponseEntity<ErrorMessage> handleMCCBException(MCCBException e) {
		ErrorMessage exceptionMessage = new ErrorMessage(e.getMessage(), e.getLocalizedMessage(), "406");
		return new ResponseEntity<ErrorMessage>(exceptionMessage, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler({ RCBOException.class })
	public ResponseEntity<ErrorMessage> handleRCBOException(RCBOException e) {
		ErrorMessage exceptionMessage = new ErrorMessage(e.getMessage(), e.getLocalizedMessage(), "406");
		return new ResponseEntity<ErrorMessage>(exceptionMessage, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler({ LightException.class })
	public ResponseEntity<ErrorMessage> handleLightException(LightException e) {
		ErrorMessage exceptionMessage = new ErrorMessage(e.getMessage(), e.getLocalizedMessage(), "406");
		return new ResponseEntity<ErrorMessage>(exceptionMessage, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	}
	
}
