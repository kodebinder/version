package com.company.interview;

import java.util.HashSet;
import java.util.Set;

public class FindDeltaTester {
    public static void main(String[] args) {
        FindDeltaTester obj = new FindDeltaTester();
        int[] arr = {1, 3, 2, 5};
        int sum = 9;
        System.out.println(obj.findNumbers(arr, sum));
    }

    public boolean findNumbers(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int requiredNumber = sum - arr[i];
            if (set.contains(requiredNumber)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
