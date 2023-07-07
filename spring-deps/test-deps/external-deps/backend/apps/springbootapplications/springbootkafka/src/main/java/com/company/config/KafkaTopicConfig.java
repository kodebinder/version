package com.company.config;

import com.company.constant.ProductConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic getNewTopic() {
        return TopicBuilder.name(ProductConstants.TOPIC_NAME).build();
    }
}
