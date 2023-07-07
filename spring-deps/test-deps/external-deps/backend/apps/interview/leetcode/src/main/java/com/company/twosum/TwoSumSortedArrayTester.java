package com.company.twosum;

import java.util.Arrays;

public class TwoSumSortedArrayTester {
    public static void main(String[] args) {
        TwoSumSortedArrayTester twoSum = new TwoSumSortedArrayTester();
        System.out.println(Arrays.toString(twoSum.twoSumSortedArrayUsingTwoPointerApproach(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum.twoSumSortedArrayUsingTwoPointerApproach(new int[]{2, 7, 11, 15}, 13)));
        System.out.println(Arrays.toString(twoSum.twoSumSortedArrayUsingTwoPointerApproach(new int[]{2, 7, 11, 15}, 18)));
        System.out.println(Arrays.toString(twoSum.twoSumSortedArrayUsingTwoPointerApproach(new int[]{2, 7, 11, 15}, 19)));
        System.out.println(Arrays.toString(twoSum.twoSumSortedArrayUsingTwoPointerApproach(new int[]{-5, -4, -3, -2, -1}, -8)));
    }

    public int[] twoSumSortedArrayUsingTwoPointerApproach(int[] numbers, int target) {

        int aPointer = 0;
        int bPointer = numbers.length - 1;

        while (aPointer <= bPointer) {
            int sum = numbers[aPointer] + numbers[bPointer];
            if (sum < target) {
                aPointer += 1;
            } else if (sum > target) {
                bPointer -= 1;
            } else {
                return new int[]{aPointer + 1, bPointer + 1};
            }
        }

        return new int[]{-1, -1};
    }

}
