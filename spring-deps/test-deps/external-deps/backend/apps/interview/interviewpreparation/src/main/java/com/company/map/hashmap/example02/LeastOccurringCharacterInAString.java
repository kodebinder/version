package com.company.map.hashmap.example02;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class LeastOccurringCharacterInAString {
    public static void main(String[] args) {
        LeastOccurringCharacterInAString obj = new LeastOccurringCharacterInAString();
        String str = "abacabbc";
        System.out.println(obj.getLeastOccurringCharacter(str));

    }

    public Character getLeastOccurringCharacter(String str) {
        return str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .min(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getKey();
    }
}
