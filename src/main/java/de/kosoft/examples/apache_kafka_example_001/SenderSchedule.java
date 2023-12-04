package de.kosoft.examples.apache_kafka_example_001;

import java.time.Instant;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SenderSchedule {
    
    private final KafkaProducer kafkaProducer;

    public SenderSchedule(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @Scheduled(fixedDelay = 1000L)
    public void run(){
        kafkaProducer.sendMessage("timer", Instant.now().toString());
    }
}
