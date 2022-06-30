package com.learn.contacts_api_v2.service;

import com.learn.contacts_api_v2.exception.ContactExistsException;
import com.learn.contacts_api_v2.exception.ContactNotFoundException;
import com.learn.contacts_api_v2.model.Contact;

import java.util.List;


public interface ContactService {
	
	Contact addContact(Contact contact) throws ContactExistsException;
	Contact getContact(String contactId) throws ContactNotFoundException;
	List<Contact> getAllContacts();
	void deleteContact(String contactId);

}
