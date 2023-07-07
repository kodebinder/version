package com.company.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 10, 20, 30, 15};

        int sum = Arrays.stream(nums).boxed()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        double average = Arrays.stream(nums).boxed()
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println(average);

        double sumOfSquares = Arrays.stream(nums).boxed()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println(sumOfSquares);

        List<Integer> even = Arrays.stream(nums).boxed()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);

        List<Integer> numsStartWith2 = Arrays.stream(nums).boxed()
                .map(String::valueOf)
                .filter(e -> e.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(numsStartWith2);

        Set<Integer> set = new HashSet<Integer>();
        Arrays.stream(nums).boxed()
                .filter(e -> !set.add(e))
                .collect(Collectors.toSet());

        int max = Arrays.stream(nums).boxed()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(max);

        int min = Arrays.stream(nums).boxed()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(min);

        List<Integer> sortedAsc = Arrays.stream(nums).boxed()
                .sorted(Comparator.comparing(Integer::valueOf))
                .collect(Collectors.toList());
        System.out.println(sortedAsc);

        List<Integer> sortedDesc = Arrays.stream(nums).boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedDesc);

        int maxElement = Arrays.stream(nums).boxed()
                .sorted(Collections.reverseOrder())
                .findFirst().get();
        System.out.println(maxElement);
    }
}
