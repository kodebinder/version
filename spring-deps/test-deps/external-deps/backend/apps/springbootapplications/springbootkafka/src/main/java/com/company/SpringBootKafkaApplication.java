package com.company;

import com.company.constant.ProductConstants;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringBootKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            for (int i = 0; i < 10_000; i++) {
                kafkaTemplate.send(ProductConstants.TOPIC_NAME, "processing event : " + i);
            }
        };
    }

}