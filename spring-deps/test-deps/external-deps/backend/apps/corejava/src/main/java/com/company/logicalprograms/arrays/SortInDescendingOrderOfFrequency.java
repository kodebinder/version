package com.company.logicalprograms.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortInDescendingOrderOfFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 2, 3, 4, 1, 4, 1};
        List<Integer> numbers = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.collectingAndThen(Collectors.toList(), l -> {
                                    Collections.reverse(l);
                                    return l;
                                }
                        )
                );
        System.out.println(numbers);
    }
}
