package com.learn.contacts_api_v2.exception;

public class ContactExistsException extends Exception {
    public ContactExistsException(String message) {
        super(message);
    }
}
