package com.kafkatest.Contoller;

import com.kafkatest.Model.Message;
import com.kafkatest.Service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private Producer producer;

    @GetMapping("/generate")
    public String generate(@RequestBody Message message){
          producer.produce(message);
          return "OK";
    }
}
