package com.company.programs.runlengthencoding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

// https://www.youtube.com/watch?v=ry8V09C3v0o
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "wwwwaaadexxxxxxywww";
        System.out.println(solution.encode(input));
        System.out.println(solution.encoding(input));
        System.out.println(solution.compress(input));
        solution.print();
    }

    public String encode(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            stringBuilder.append(str.charAt(i));
            stringBuilder.append(count);
        }
        return String.valueOf(stringBuilder);
    }

    public String encoding(String str) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            count++;
            if (str.charAt(i) != str.charAt(i + 1)) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(count);
                count = 0;
            }
        }
        stringBuilder.append(str.charAt(str.length() - 1));
        stringBuilder.append(count + 1);

        return String.valueOf(stringBuilder);
    }

    public String compress(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("(([a-zA-Z])\\2*)");
        pattern.matcher(str).results().forEach(result -> {
            int repetitions = result.group(1).length();
            stringBuilder.append(result.group(2)).append(repetitions);
        });
        return String.valueOf(stringBuilder);
    }

    public void print() {
        System.out.println("Using Imperative ");
        Map<String, String> capitals = new LinkedHashMap<>();
        capitals.put("Maharashtra", "Mumbai");
        capitals.put("Karnataka", "Bengaluru");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Using Java 8");
        capitals.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
