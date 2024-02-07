package com.kafka.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListner {
    @KafkaListener(topics = "topic-01")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Received message" + record.value());
    }
}
