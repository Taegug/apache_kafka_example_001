package de.kosoft.examples.apache_kafka_example_001;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class KafakConsumer {
    
    @KafkaListener(topics = {"timer"})
    public void consume(String message){
        log.info("Received message: " + message);
    }
}
