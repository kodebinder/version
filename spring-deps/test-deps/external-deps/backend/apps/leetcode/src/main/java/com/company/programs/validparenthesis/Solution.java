package com.company.programs.validparenthesis;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * <p>
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
@Slf4j
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {
                "()",
                "()[]{}",
                "(]"
        };
        log.info("{}", Arrays.stream(words).collect(Collectors.toMap(e -> e, word -> solution.isValid(word))));
        log.info("{}", Arrays.stream(words).collect(Collectors.toMap(e -> e, solution::isValid)));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            if (stack.isEmpty())
                return false;

            char check;
            if (ch == ')') {
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
            } else if (ch == '}') {
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
            } else if (ch == ']') {
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }

}
