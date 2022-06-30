package com.learn.KafkaProducerService.controller;


import com.learn.KafkaProducerService.service.ProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private ProducerService service;

    @GetMapping("/api/{message}")
    public String sendMessage(@PathVariable String message){
        service.sendMessage(message);
        return "Sent : " + message;
    }

}
