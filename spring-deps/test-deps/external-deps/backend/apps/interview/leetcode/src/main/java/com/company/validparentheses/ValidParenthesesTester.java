package com.company.validparentheses;

import java.util.Arrays;
import java.util.Stack;

public class ValidParenthesesTester {
    public static void main(String[] args) {
        ValidParenthesesTester validParentheses = new ValidParenthesesTester();
        String[] arr = {"()", "()[]{}", "(]"};
        Arrays.stream(arr)
                .map(validParentheses::isValid)
                .forEach(System.out::println);
    }

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            }
            if (stack.isEmpty()) {
                return false;
            }

            char popChar;
            switch (arr[i]) {
                case ')':
                    popChar = (char) stack.pop();
                    if (popChar == '{' || popChar == '[')
                        return false;
                    break;
                case '}':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '[')
                        return false;
                    break;
                case ']':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
