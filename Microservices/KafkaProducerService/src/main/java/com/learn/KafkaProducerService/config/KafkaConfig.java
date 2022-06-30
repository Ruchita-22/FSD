package com.learn.KafkaProducerService.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {


    //creates a Topic if it does not exist in Broker
    @Bean
    public NewTopic topicOne(){
       return TopicBuilder.name("topicOne").partitions(3).build();
    }
}
