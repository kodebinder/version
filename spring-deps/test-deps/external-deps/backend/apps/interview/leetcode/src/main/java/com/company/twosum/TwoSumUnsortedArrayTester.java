package com.company.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUnsortedArrayTester {
    public static void main(String[] args) {
        TwoSumUnsortedArrayTester twoSum = new TwoSumUnsortedArrayTester();
        System.out.println(Arrays.toString(twoSum.twoSumUnsortedArrayUsingBruteForce(new int[]{2, 1, 6, 3}, 9)));
        System.out.println(Arrays.toString(twoSum.twoSumUnsortedArrayUsingHashMap(new int[]{2, 1, 6, 3}, 9)));
        System.out.println(Arrays.toString(twoSum.twoSumUnsortedArrayUsingBruteForce(new int[]{2, 1, 6, 3}, 10)));
        System.out.println(Arrays.toString(twoSum.twoSumUnsortedArrayUsingHashMap(new int[]{2, 1, 6, 3}, 10)));

    }

    public int[] twoSumUnsortedArrayUsingBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int delta = target - nums[i];

                if (nums[j] == delta) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumUnsortedArrayUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];

            if (map.containsKey(delta)) {
                return new int[]{map.get(delta), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
// Time: O(n)
// Space: O(n)
