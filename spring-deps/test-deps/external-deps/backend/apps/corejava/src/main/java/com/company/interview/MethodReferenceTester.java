package com.company.interview;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTester {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        nums.forEach(n -> System.out.println(n));
        nums.forEach(System.out::println);
    }
}
