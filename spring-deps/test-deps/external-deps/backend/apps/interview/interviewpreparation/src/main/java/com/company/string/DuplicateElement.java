package com.company.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] nums = {9,8,2,6,3,9,6,4,6,5};
        List<Integer> dups = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(dups);

    }
}
