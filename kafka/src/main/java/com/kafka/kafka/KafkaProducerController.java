package com.kafka.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {
    @Autowired
    private KafkaTemplate<String, String> template;

    @GetMapping("/sendMessage")
    public String sendMessage() {
    template.send("topic-01", "Kafka");
    return "Message sent successfully";
    }
}
