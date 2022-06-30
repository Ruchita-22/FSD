package com.learn.contacts_api_v2.exception;


import com.learn.contacts_api_v2.model.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@ExceptionHandler(ContactNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleContactNotFound(ContactNotFoundException exception){
		ErrorResponse response = new ErrorResponse("Contact Not found", 404);
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ContactExistsException.class)
	public ResponseEntity<ErrorResponse> handleContactExists(ContactExistsException exception){
		logger.debug("ContactExistsException occured", exception);
		ErrorResponse response = new ErrorResponse("Contact with the email already exists", 409);
		return new ResponseEntity<>(response, HttpStatus.CONFLICT);
	}
}