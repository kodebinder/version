package com.company.map.hashmap.example02;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurringCharacterInAString {
    public static void main(String[] args) {
        MaxOccurringCharacterInAString obj = new MaxOccurringCharacterInAString();
        String str = "abacabbc";
        System.out.println(obj.getMaxOccurringCharacter(str));

    }

    public Character getMaxOccurringCharacter(String str) {
        return str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getKey();
    }
}
