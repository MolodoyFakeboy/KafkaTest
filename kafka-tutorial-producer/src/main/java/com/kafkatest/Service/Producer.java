package com.kafkatest.Service;

import com.kafkatest.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void produce(Message message){
        System.out.println("Producing message");
        kafkaTemplate.send("messages",message);
    }
}
