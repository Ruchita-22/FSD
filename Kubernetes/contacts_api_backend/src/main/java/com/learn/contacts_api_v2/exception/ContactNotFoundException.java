package com.learn.contacts_api_v2.exception;

//@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Contact not found")
public class ContactNotFoundException extends Exception {

	public ContactNotFoundException(String message) {
		super(message);
	}
	
	
}
