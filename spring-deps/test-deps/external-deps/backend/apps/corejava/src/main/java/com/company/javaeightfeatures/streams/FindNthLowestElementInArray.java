package com.company.javaeightfeatures.streams;

import java.util.Arrays;

public class FindNthLowestElementInArray {
    public static void main(String[] args) {
        int[] nums = {6, 3, 6, 2, 6, 6, 0, 4, 1, 2};
        Integer secondLargestNum = Arrays.stream(nums).boxed()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargestNum);
    }
}
