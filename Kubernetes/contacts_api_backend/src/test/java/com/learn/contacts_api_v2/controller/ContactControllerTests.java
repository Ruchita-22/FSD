package com.learn.contacts_api_v2.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learn.contacts_api_v2.exception.ContactNotFoundException;
import com.learn.contacts_api_v2.model.Contact;
import com.learn.contacts_api_v2.service.ContactService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ContactController.class)
@ExtendWith(SpringExtension.class)
public class ContactControllerTests {

    @MockBean
    private ContactService service;

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private ContactController contactController;

    @Autowired
    private ObjectMapper mapper;

    private Contact contact;

    @BeforeEach
    public void setUp() {
        contact = new Contact("1", "name", "test@mail.com","9999911111","test");
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetContactById() throws Exception {
        when(service.getContact(Mockito.anyString())).thenReturn(new Contact());
        mockMvc.perform(get("/api/v1/contacts/1"))
                        .andExpect(status().is(200));
    }

    @Test
    public void testGetContactByIdFailure() throws Exception {
        when(service.getContact(Mockito.anyString())).thenThrow(ContactNotFoundException.class);
        mockMvc.perform(get("/api/v1/contacts/1"))
                .andExpect(status().is(404));
    }

    @Test
    public void testaddContact() throws Exception {
        when(service.addContact(Mockito.any(Contact.class))).thenReturn(new Contact());
        mockMvc.perform(post("/api/v1/contacts")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapper.writeValueAsString(contact)))
                .andExpect(status().is(201))
                .andDo(print());
    }


}