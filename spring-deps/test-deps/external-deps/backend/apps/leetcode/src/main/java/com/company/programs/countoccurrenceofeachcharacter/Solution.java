package com.company.programs.countoccurrenceofeachcharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 */
// https://www.youtube.com/watch?v=BaD8j96fGOk
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "HelloWorld";
        System.out.println(solution.usingImperativeStyleCode(str));
        System.out.println(solution.usingFunctionalStyleCode(str));
    }

    private Map<Character, Integer> usingImperativeStyleCode(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    private Map<Character, Integer> usingFunctionalStyleCode(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = IntStream.range(0, chars.length)
                .mapToObj(c -> chars[c])
                .collect(Collectors.toMap(Function.identity(), character -> 1, Integer::sum, LinkedHashMap::new));
        return map;
    }
}
