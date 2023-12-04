package de.kosoft.examples.apache_kafka_example_001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableKafka
public class ApacheKafkaExample001Application {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaExample001Application.class, args);
	}

}
