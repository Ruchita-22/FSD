package com.example.ConsumerService.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageConsumerService {

    @KafkaListener(topics = "topicOne", groupId = "groupone")
    public void listen(String messsage) {
        log.info("Message Received : {}", messsage);
    }

}
