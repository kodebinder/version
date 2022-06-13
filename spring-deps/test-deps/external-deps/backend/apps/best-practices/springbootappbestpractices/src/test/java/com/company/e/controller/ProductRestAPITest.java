package com.company.e.controller;

import com.company.e.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Slf4j
@Disabled
// Do not add public access modifier below
class ProductRestAPITest {

    @Value("${productrestapi.services.url}")
    private String baseURL;

    @Test
    @Order(1)
        // Do not add public access modifier below
    void shouldCreateProduct() {
        log.info("baseURL : {}", baseURL);
        RestTemplate restTemplate = new RestTemplate();
        Product product = Product.builder().id(1L).name("IPhone").description("Its Awesome").price(1000).build();
        Product newProduct = restTemplate.postForObject(baseURL, product, Product.class);
        Assertions.assertNotNull(newProduct);
        Assertions.assertNotNull(newProduct.getId());
        Assertions.assertEquals("IPhone", newProduct.getName());
    }

    @Test
    @Order(2)
        // Do not add public access modifier below
    void shouldGetProduct() {
        RestTemplate restTemplate = new RestTemplate();
        Product product = restTemplate.getForObject(baseURL + 1, Product.class);
        Assertions.assertNotNull(product);
        Assertions.assertEquals("IPhone", product.getName());
    }

    @Test
    @Order(3)
        // Do not add public access modifier below
    void shouldUpdateProduct() {
        RestTemplate restTemplate = new RestTemplate();
        Product product = restTemplate.getForObject(baseURL + 1, Product.class);
        product.setPrice(1500);
        restTemplate.put(baseURL, product);
        Assertions.assertNotNull(product);
        Assertions.assertEquals(1500, product.getPrice());
    }

}
