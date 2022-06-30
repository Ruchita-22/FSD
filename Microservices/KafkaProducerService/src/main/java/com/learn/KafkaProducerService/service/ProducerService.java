package com.learn.KafkaProducerService.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public ObjectMapper mapper;


    public void sendMessage(String message){

            kafkaTemplate.send("topicOne", "Product to be shipped " + message);

    }
}
