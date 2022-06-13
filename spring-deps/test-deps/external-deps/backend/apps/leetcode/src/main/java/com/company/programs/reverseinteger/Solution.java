package com.company.programs.reverseinteger;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Random;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 *
 * Example 3:
 * Input: x = 120
 * Output: 21
 *
 * Constraints:
 * -231 <= x <= 231 - 1
 */
@Slf4j
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int low = -100, high = 100;
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = new Random().nextInt(high - low) + low;
        }
        System.out.println("Original : ");
        Arrays.stream(numbers)
                .forEach(System.out::println);
        System.out.println("Reversed : ");
        Arrays.stream(numbers)
                .map(solution::reverseInt)
                .forEach(System.out::println);
    }

    public int reverseInt(int x) {
        int rev_num = 0;
        for (int i = x; i != 0; i /= 10) {

            if (rev_num > Integer.MAX_VALUE / 10 || (rev_num == Integer.MAX_VALUE / 10 && i % 10 > 7))
                return 0;
            if (rev_num < Integer.MIN_VALUE / 10 || (rev_num == Integer.MIN_VALUE / 10 && i % 10 < -8))
                return 0;

            rev_num = rev_num * 10 + i % 10;
        }
        return rev_num;
    }

}
