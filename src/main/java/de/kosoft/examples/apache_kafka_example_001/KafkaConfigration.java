package de.kosoft.examples.apache_kafka_example_001;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfigration {
    
    @Bean NewTopic timerTopic(){
        return new NewTopic("timer", 1,(short) 1);
    }
}
