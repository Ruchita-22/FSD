package com.learn.contacts_api_v2.dao;

import com.learn.contacts_api_v2.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactDao extends MongoRepository<Contact, String> {

	List<Contact> findByCategory(String category);

	Optional<Contact> findByEmail(String email);

	boolean existsByEmail(String email);

}
