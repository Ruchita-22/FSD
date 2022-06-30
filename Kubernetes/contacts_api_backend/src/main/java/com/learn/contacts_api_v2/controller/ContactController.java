package com.learn.contacts_api_v2.controller;

import com.learn.contacts_api_v2.exception.ContactExistsException;
import com.learn.contacts_api_v2.exception.ContactNotFoundException;
import com.learn.contacts_api_v2.model.Contact;
import com.learn.contacts_api_v2.service.ContactService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ContactController {

	private static Logger logger = LoggerFactory.getLogger(ContactController.class);

	private ContactService service;
	
	@Autowired
	public ContactController(ContactService service) {
		this.service = service;
	}

	@GetMapping("/info")
	public String apiInfo() {
		return "Contacts API is UP and Running";
	}
	
	@GetMapping("/contacts")
	@ApiOperation("Get All Contacts")
	public List<Contact> getContacts() {
		return service.getAllContacts();

	}
	
	@GetMapping("/contacts/{contactId}")
	public Contact getContactById(@PathVariable String contactId) throws ContactNotFoundException {
		logger.info("Contact ID received : {}", contactId);
		return service.getContact(contactId);
	}
	
	@PostMapping("/contacts")
	public ResponseEntity<?> addContact(@RequestBody Contact contact) throws ContactExistsException {
		Contact newContact = service.addContact(contact);
		return new ResponseEntity<>(newContact, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/contacts/{contactId}")
	public void deleteContact(@PathVariable String contactId) {
		service.deleteContact(contactId);
	}
}