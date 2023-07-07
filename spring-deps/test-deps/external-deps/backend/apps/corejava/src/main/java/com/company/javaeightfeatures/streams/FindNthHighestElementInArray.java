package com.company.javaeightfeatures.streams;

import java.util.Arrays;
import java.util.Comparator;

public class FindNthHighestElementInArray {
    public static void main(String[] args) {
        int[] nums = {6, 3, 6, 2, 6, 6, 0, 4, 1, 2};
        Integer secondLargestNum = Arrays.stream(nums).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargestNum);
    }
}
