package com.company.findAllDuplicatesInArray;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicatesInUnsortedArrayTester {
    public static void main(String[] args) {
        FindAllDuplicatesInUnsortedArrayTester findAllDuplicatesInUnsortedArray = new FindAllDuplicatesInUnsortedArrayTester();
        System.out.println(Arrays.toString(findAllDuplicatesInUnsortedArray.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1})));
        System.out.println(findAllDuplicatesInUnsortedArray.findDuplicateElements(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    public int[] findDuplicates(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toList())
                //.toList()
                .stream()
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public List<Integer> findDuplicateElements(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toList())
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
