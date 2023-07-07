package com.company.removeduplicatesfromarray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArrayTester {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7, 8, 8, 8, 8, 9, 10};
        Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet())
                .forEach(e -> System.out.print(e + " "));

        System.out.println("");
        List<Integer> numList = Arrays.stream(nums)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numList);
    }
}
