package com.learn.contacts_api_v2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    private String contactId;
    private String name;
    private String email;
    private String mobile;
    private String category;
}
