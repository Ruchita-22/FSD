package com.learn.contacts_api_v2.service;

import com.learn.contacts_api_v2.dao.ContactDao;
import com.learn.contacts_api_v2.exception.ContactExistsException;
import com.learn.contacts_api_v2.exception.ContactNotFoundException;
import com.learn.contacts_api_v2.model.Contact;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ContactServiceImplTests {

    @Mock
    private ContactDao dao;

    @InjectMocks
    private ContactServiceImpl service;
    private Contact contact;

    @BeforeEach
    public void setUp() {
        this.contact = new Contact("1", "name", "test@mail.com","9999911111","test");
    }

    @AfterEach
    public void tearDown() {
        this.contact = null;
    }

    @Test
    public void testAddContact() throws ContactExistsException {
        when(dao.existsByEmail(anyString())).thenReturn(false);
        when(dao.save(contact)).thenReturn(contact);
        assertEquals(contact, service.addContact(contact));
        verify(dao,times(1)).existsByEmail(anyString());
        verify(dao, atMostOnce()).save(contact);
    }

    @Test
    public void testAddExistingContact() throws ContactExistsException {
        when(dao.existsByEmail(anyString())).thenReturn(true);
        assertThrows(ContactExistsException.class, ()-> service.addContact(contact));
        verify(dao,times(1)).existsByEmail(anyString());
    }

    @Test
    public void testGetContactById() throws ContactNotFoundException{
      when(dao.findById(anyString())).thenReturn(Optional.of(contact));
      assertEquals(contact,service.getContact("1"));
      verify(dao,times(1)).findById(anyString());

    }


    @Test
    public void testGetContactByIdFailure() throws ContactNotFoundException{
        when(dao.findById(anyString())).thenReturn(Optional.empty());
        assertThrows(ContactNotFoundException.class, () -> service.getContact("1"));
        verify(dao,times(1)).findById(anyString());
    }


}