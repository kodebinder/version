package com.company.programs.twosum;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1
 * Input nums = [2,7,11,15], target = 9
 * Output [0,1]
 * Explanation Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2
 * Input nums = [3,2,4], target = 6
 * Output [1,2]
 * <p>
 * Example 3
 * Input nums = [3,3], target = 6
 * Output [0,1]
 * <p>
 * Constraints
 * 2 = nums.length = 104
 * -109 = nums[i] = 109
 * -109 = target = 109
 * Only one valid answer exists.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(solution.getIndicesUsingMap(numbers, target)));
        System.out.println(Arrays.toString(solution.testGetIndicesUsingMap(numbers, target)));
        numbers = new int[]{7, -9, 4};
        target = 100;
        System.out.println(Arrays.toString(solution.getIndicesUsingMap(numbers, target)));
        System.out.println(Arrays.toString(solution.testGetIndicesUsingMap(numbers, target)));
    }

    public int[] getIndicesUsingMap(int[] numbers, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if (map.containsKey(temp)) {
                output[0] = i;
                output[1] = map.get(temp);
            }
            map.put(numbers[i], i);
        }
        return output;
    }

    public int[] testGetIndicesUsingMap(int[] numbers, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if (map.containsKey(delta)) {
                return new int[]{i, map.get(delta)};
            }
            map.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}
