package com.example.kafkaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableKafka
@SpringBootApplication
public class KafkaSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringBootApplication.class, args);
    }

}