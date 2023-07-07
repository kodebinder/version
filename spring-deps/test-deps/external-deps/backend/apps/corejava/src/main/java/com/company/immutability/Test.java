package com.company.immutability;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //System.out.println(IntStream.range(1,5).sum());
//        Arrays.stream(new String[]{"Pushkar","Pooja","Vikas","Amit"})
//                .filter(x -> x.startsWith("P"))
//                .sorted()
//                .forEach(System.out::println);

        int[] nums = {1, 2, 3, 4, 1, 2, 3, 4, 1, 4, 1};
        List<Integer> keys = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(keys);

    }
}
