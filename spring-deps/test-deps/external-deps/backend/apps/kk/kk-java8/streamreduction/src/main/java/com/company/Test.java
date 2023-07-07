package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Test obj = new Test();
//        int sum = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
//                .reduce(0, (a, b) -> a + b);
//        System.out.println(sum);

        List<Product> products = Arrays.asList(new Product(23, "potatoes"), new Product(14, "orange"),
                new Product(13, "lemon"), new Product(23, "bread"), new Product(13, "sugar"));

        Arrays.asList("Delhi", "Mumbai", "Chennai")
                .stream()
                .collect(Collectors.toMap(Function.identity(), String::length))
                .forEach((k, v) -> System.out.println(k + "\t" + v));

        Arrays.asList("Delhi", "Mumbai", "Chennai")
                .stream()
                .collect(Collectors.toMap(Function.identity(), String::toUpperCase))
                .forEach((k, v) -> System.out.println(k + "\t" + v));

    }


}
