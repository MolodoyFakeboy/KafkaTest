package com.kafkatest.Service;

import com.kafkatest.Model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "messages",groupId = "message_group")
    public void  consume(Message message){
        System.out.println("Consuming the message: " + message);
    }
}

