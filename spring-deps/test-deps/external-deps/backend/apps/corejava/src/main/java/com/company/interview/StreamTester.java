package com.company.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTester {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 2, 2, 1, 1};

        Integer max = Arrays.stream(nums)
                .boxed()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("Max number: " + max);

        Integer min = Arrays.stream(nums)
                .boxed()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("\nMin number: " + min);

        System.out.println("\nSum: " + Arrays.stream(nums).boxed().mapToInt(a -> a).sum());
        System.out.println("\nSum: " + Arrays.stream(nums).boxed().mapToInt(Integer::valueOf).sum());

        System.out.println("\nSum of squares of all numbers: " + Arrays.stream(nums).boxed().mapToInt(e -> e * e).sum());

        List<Integer> frequencyList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.collectingAndThen(Collectors.toList(), l -> {
                                    Collections.reverse(l);
                                    return l;
                                }
                        )
                );
        System.out.println("\nFrequency: " + frequencyList);

    }
}
