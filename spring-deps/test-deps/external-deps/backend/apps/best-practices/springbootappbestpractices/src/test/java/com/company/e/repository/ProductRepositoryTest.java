package com.company.e.repository;

import com.company.e.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void testSaveProduct(){
//        Product product = new Product();
//        product.setId(1L);
//        product.setName("IPhone");
//        product.setPrice(1000.0);

        Product product = Product.builder().id(1L).name("IPhone").price(1000.0).build();
        productRepository.save(product);
        Product savedProduct = productRepository.findById(1L).get();
        Assertions.assertNotNull(savedProduct);
    }
}