package com.learn.contacts_api_v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ContactsApiV2Application {

	public static void main(String[] args) {
		SpringApplication.run(ContactsApiV2Application.class, args);
	}

}
