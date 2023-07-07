package com.company.containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfArrayContainsDuplicatesTester {
    public static void main(String[] args) {
        CheckIfArrayContainsDuplicatesTester checkIfArrayContainsDuplicates = new CheckIfArrayContainsDuplicatesTester();
        System.out.println(checkIfArrayContainsDuplicates.checkIfArrayContainsDuplicatesUsingSorting(new int[]{1, 2, 3, 1}));
        System.out.println(checkIfArrayContainsDuplicates.checkIfArrayContainsDuplicatesUsingHashSet(new int[]{1, 2, 3, 1}));
        System.out.println(checkIfArrayContainsDuplicates.checkIfArrayContainsDuplicatesUsingSorting(new int[]{1, 2, 3, 4}));
        System.out.println(checkIfArrayContainsDuplicates.checkIfArrayContainsDuplicatesUsingHashSet(new int[]{1, 2, 3, 4}));
        System.out.println(checkIfArrayContainsDuplicates.checkIfArrayContainsDuplicatesUsingSorting(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(checkIfArrayContainsDuplicates.checkIfArrayContainsDuplicatesUsingHashSet(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    private boolean checkIfArrayContainsDuplicatesUsingSorting(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }

    private boolean checkIfArrayContainsDuplicatesUsingHashSet(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }


}
