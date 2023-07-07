package com.company.controller;

import com.company.constant.ProductConstants;
import com.company.model.Product;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private final KafkaTemplate<String, Product> kafkaTemplate;

    public ProductController(final KafkaTemplate<String, Product> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/product")
    public void publishProduct(@RequestBody Product product) {
        kafkaTemplate.send(ProductConstants.TOPIC_NAME, product);
    }
}
