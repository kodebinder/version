package com.company.programs.firstuniquecharacterinstring;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <p>
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * <p>
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * <p>
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 * <p>
 * Constraints:
 * 1 <= s.length <= 10^5
 * s consists of only lowercase English letters.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getIndexOfFirstNonRepeatingCharacter("leetcode"));
        System.out.println(solution.getIndexOfFirstNonRepeatingCharacter("loveleetcode"));
        System.out.println(solution.getIndexOfFirstNonRepeatingCharacter("aabb"));
    }

    public int getIndexOfFirstNonRepeatingCharacter(String str) {
        int no_of_chars = 256;
        int result = Integer.MAX_VALUE;
        Map<Character, CountIndex> hm = new HashMap<>(no_of_chars);
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.get(str.charAt(i)).incCount();
            } else
                hm.put(str.charAt(i), new CountIndex(i));
        }
        for (Map.Entry<Character, CountIndex> entry : hm.entrySet()) {
            int c = entry.getValue().count;
            int ind = entry.getValue().index;
            if (c == 1 && ind < result) {
                result = ind;
            }
        }
        if (result != Integer.MAX_VALUE)
            return result;
        else
            return -1;

    }
}

class CountIndex {
    int count, index;

    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }

    public void incCount() {
        this.count++;
    }
}

