package com.company.config.product;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProductConsumerConfig {

    @Value("${spring.kafka.bootstrapServers}")
    public String bootstrapServers;

    @Bean(name = "productConsumerFactory")
    public ConsumerFactory<String, String> getProductConsumerFactory() {
        return new DefaultKafkaConsumerFactory<>(getProductConsumerConfig());
    }

    public Map<String, Object> getProductConsumerConfig() {
        Map<String, Object> properties = new HashMap<>();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return properties;
    }

    @Bean(name="kafkaProductListenerContainerFactory")
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> getKafkaProductListenerContainerFactory(@Qualifier("productConsumerFactory") ConsumerFactory<String, String> consumerFactory) {
        ConcurrentKafkaListenerContainerFactory<String, String> concurrentKafkaListenerContainerFactory = new ConcurrentKafkaListenerContainerFactory<>();
        concurrentKafkaListenerContainerFactory.setConsumerFactory(consumerFactory);
        return concurrentKafkaListenerContainerFactory;
    }
}
