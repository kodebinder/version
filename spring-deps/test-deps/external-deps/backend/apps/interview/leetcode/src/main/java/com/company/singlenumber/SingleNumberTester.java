package com.company.singlenumber;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleNumberTester {
    public static void main(String[] args) {
        SingleNumberTester singleNumber = new SingleNumberTester();
        System.out.println(singleNumber.singleNumber(new int[]{4, 2, 3, 3, 4, 6, 2, 8, 8, 4}));
    }

    public int singleNumber(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
