package com.company;

import java.util.Arrays;
import java.util.List;

public class ProductDatabase {

    public List<Product> getProducts() {
        Product iphoneX = Product.builder()
                .id(104)
                .name("IPhone X")
                .price(500.0)
                .build();
        Product iphone12Mini = Product.builder()
                .id(102)
                .name("IPhone 12 Mini")
                .price(600.0)
                .build();
        Product iphone13Mini = Product.builder()
                .id(103)
                .name("IPhone 13 Mini")
                .price(700.0)
                .build();
        Product iphone14 = Product.builder()
                .id(101)
                .name("IPhone 14")
                .price(900.0)
                .build();
        List<Product> products = Arrays.asList(iphoneX, iphone12Mini, iphone13Mini, iphone14);
        return products;
    }
}
