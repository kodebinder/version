package com.company.programs.integertoroman;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Convert Integer to Roman numeral - LeetCode Interview Coding Challenge [Java Brains]
 * https://www.youtube.com/watch?v=JyLrPSJNfYw
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 * <p>
 * Example 1:
 * Input: num = 3
 * Output: "III"
 * Explanation: 3 is represented as 3 ones.
 * <p>
 * Example 2:
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * <p>
 * Example 3:
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * Constraints:
 * 1 <= num <= 3999
 */
@Slf4j
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int low = 1, high = 3999;
        int[] numbers = new int[1_000_000_0];
        for (int i = 0; i < 1_000_000_0; i++) {
            numbers[i] = new Random().nextInt(high - low) + low;
        }
        long start1 = System.currentTimeMillis();
        log.info("{}", Arrays.stream(numbers).mapToObj(n -> solution.intToRoman(solution.getCache(), n)).collect(Collectors.joining(" ")));
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        log.info("{}", Arrays.stream(numbers).mapToObj(n -> solution.testIntToRoman(solution.getCache(), n)).collect(Collectors.joining(" ")));
        long end2 = System.currentTimeMillis();
        log.info("Total time taken for Approach 1 : {}", end1 - start1);
        log.info("Total time taken for Approach 2 : {}", end2 - start2);
    }

    public String intToRoman(Map<Integer, String> map, int num) {
        String output = "";
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (num > 0) {
                if (num >= entry.getKey()) {
                    output += entry.getValue();
                    num -= entry.getKey();
                } else
                    break;
            }
        }
        return output;
    }

    public String testIntToRoman(Map<Integer, String> cache, int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + units[(num % 10)];
    }

    public Map<Integer, String> getCache() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        return map;
    }
}
/**
 * 1. Avoid using String rather use StringBuilder
 * 2. Time taken by both approaches :
 * 16:00:06.852 [main] INFO com.company.practise.integertoroman.Solution - Total time taken for Approach 1 : 28385
 * 16:00:06.852 [main] INFO com.company.practise.integertoroman.Solution - Total time taken for Approach 2 : 23007
 */
