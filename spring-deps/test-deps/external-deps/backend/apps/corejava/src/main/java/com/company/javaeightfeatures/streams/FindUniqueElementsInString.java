package com.company.javaeightfeatures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueElementsInString {
    public static void main(String[] args) {
        String str = "mynameispushkarchauhan";
        List<String> list =  Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
