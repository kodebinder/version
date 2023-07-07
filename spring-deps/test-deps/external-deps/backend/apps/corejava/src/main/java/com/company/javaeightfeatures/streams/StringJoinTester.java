package com.company.javaeightfeatures.streams;

import java.util.Arrays;
import java.util.List;

public class StringJoinTester {
    public static void main(String[] args) {
        List<String> nums = Arrays.asList("9", "8", "2", "6");
        String joined = String.join("->", nums);
        System.out.println(joined);

    }
}
