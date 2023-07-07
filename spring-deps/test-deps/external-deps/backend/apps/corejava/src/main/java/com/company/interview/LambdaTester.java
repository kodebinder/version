package com.company.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaTester {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 2);
        System.out.println(nums);
        Collections.sort(nums, (a, b) -> a - b);
        //  Collections.sort(nums, Comparator.comparingInt(a -> a));
        System.out.println(nums);
        Collections.sort(nums, (a, b) -> b - a);
        System.out.println(nums);
    }
}
