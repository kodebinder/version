package com.company.config.string;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaStringConsumerConfig {

    @Value("${spring.kafka.bootstrapServers}")
    public String bootstrapServers;

    @Bean(name = "stringConsumerFactory")
    public ConsumerFactory<String, String> getStringConsumerFactory() {
        return new DefaultKafkaConsumerFactory<>(getStringConsumerConfig());
    }

    public Map<String, Object> getStringConsumerConfig() {
        Map<String, Object> properties = new HashMap<>();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return properties;
    }

    @Bean(name="kafkaStringListenerContainerFactory")
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> getKafkaStringListenerContainerFactory(@Qualifier("stringConsumerFactory") ConsumerFactory<String, String> consumerFactory) {
        ConcurrentKafkaListenerContainerFactory<String, String> concurrentKafkaListenerContainerFactory = new ConcurrentKafkaListenerContainerFactory<>();
        concurrentKafkaListenerContainerFactory.setConsumerFactory(consumerFactory);
        return concurrentKafkaListenerContainerFactory;
    }
}
