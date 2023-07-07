package com.company.palindromenumber;

import java.util.Arrays;

public class PalindromeNumberTester {
    public static void main(String[] args) {
        PalindromeNumberTester palindromeNumber = new PalindromeNumberTester();
        int[] nums = {121, -121, 10};
        Arrays.stream(nums)
                .boxed()
                .map(palindromeNumber::isPalindrome)
                .forEach(System.out::println);
    }

    public boolean isPalindrome(int n) {
        String num = String.valueOf(n);
        char[] arr = num.toCharArray();

        int aPointer = 0;
        int bPointer = num.length() - 1;

        while (aPointer < bPointer) {
            if (arr[aPointer] != arr[bPointer]) {
                return false;
            }

            aPointer += 1;
            bPointer -= 1;
        }

        return true;
    }
}
