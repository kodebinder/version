package com.company.programs.romantointeger;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Convert Roman numeral to Integer - LeetCode Interview Coding Challenge [Java Brains]
 * https://www.youtube.com/watch?v=hEhf_oz3wsM&list=PLqq-6Pq4lTTZgXnsBNQwCWdKR6O6Cgk1Z&index=7
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
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Example 1:
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * <p>
 * Example 2:
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * <p>
 * Example 3:
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * Constraints:
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
@Slf4j
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] romans = {"III", "LVIII", "MCMXCIV"};
        long start1 = System.currentTimeMillis();
        log.info("{}", Arrays.stream(romans).map(e -> solution.romanToInt(solution.getCache(), e)).collect(Collectors.toList()));
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        log.info("{}", Arrays.stream(romans).map(e -> solution.testRomanToInt(solution.getCache(), e)).collect(Collectors.toList()));
        long end2 = System.currentTimeMillis();
        log.info("Total time taken for Approach 1 : {}", end1 - start1);
        log.info("Total time taken for Approach 2 : {}", end2 - start2);
    }

    public int romanToInt(Map<Character, Integer> cache, String str) {
        int sum = 0;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(cache.get(str.charAt(i)));
        }
        for (int i = 0; i < str.length(); i++) {
            if (i != str.length() - 1 && list.get(i) < list.get(i + 1)) {
                sum += list.get(i + 1) - list.get(i);
                i++;
            } else
                sum += list.get(i);
        }
        return sum;
    }


    public int testRomanToInt(Map<Character, Integer> cache, String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && cache.get(str.charAt(i)) > cache.get(str.charAt(i - 1))) {
                result += cache.get(str.charAt(i)) - 2 * cache.get(str.charAt(i - 1));
            } else {
                result += cache.get(str.charAt(i));
            }
        }
        return result;
    }

    public Map<Character, Integer> getCache() {
        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}
/**
 * 1. Avoid using String rather use StringBuilder
 * 2. Time taken by both approaches :
 * 16:00:06.852 [main] INFO com.company.practise.integertoroman.Solution - Total time taken for Approach 1 : 28385
 * 16:00:06.852 [main] INFO com.company.practise.integertoroman.Solution - Total time taken for Approach 2 : 23007
 */
