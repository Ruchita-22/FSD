package com.learn.contacts_api_v2.service;

import com.learn.contacts_api_v2.dao.ContactDao;
import com.learn.contacts_api_v2.exception.ContactExistsException;
import com.learn.contacts_api_v2.exception.ContactNotFoundException;
import com.learn.contacts_api_v2.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContactServiceImpl implements ContactService {

	private final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);

	private ContactDao dao;
	
	@Autowired
	public ContactServiceImpl(ContactDao dao) {
		this.dao = dao;
	}

	@Override
	public Contact addContact(Contact contact) throws ContactExistsException {
		if(dao.existsByEmail(contact.getEmail())){
			logger.warn("Contact with Email ID already exists : {} ", contact.getEmail());
			throw new ContactExistsException("Contact Exists");
		}

		contact.setContactId(UUID.randomUUID().toString());
		return dao.save(contact);
	}

	@Override
	public Contact getContact(String contactId) throws ContactNotFoundException {
		logger.info("GET Contact started");
		final Optional<Contact> optionalContact = dao.findById(contactId);
		if(optionalContact.isEmpty()) {
			logger.error("Contact not Found : {}", contactId);
			throw new ContactNotFoundException("Contact not found");
		}
		return optionalContact.get();
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = new ArrayList<>();
		dao.findAll().forEach(contact -> contacts.add(contact));
		return contacts;
	}

	@Override
	public void deleteContact(String contactId) {
		dao.deleteById(contactId);
	}
}
