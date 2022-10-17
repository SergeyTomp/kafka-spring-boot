package com.example.kafkaspringboot;

import com.example.kafkaspringboot.model.UserDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@EnableKafka
@Component
public class Listener {
    @KafkaListener(topics = "msg", groupId = "app.1")
    public void messageListener(ConsumerRecord<Long, UserDto> record) {
        System.out.println("partition - " + record.partition());
        System.out.println("key - " + record.key());
        System.out.println(record.value());
    }
}
