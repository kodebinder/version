package com.company.programs.reversestring;

/**
 *
 */
public class Solution {
    public static void main(String[] args) {
        String key = "Pushkar Chauhan";
        System.out.println(new Solution().reverseString(key));
    }

    private String reverseString(String str) {
        int n = str.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return String.valueOf(stringBuilder);
    }
}
