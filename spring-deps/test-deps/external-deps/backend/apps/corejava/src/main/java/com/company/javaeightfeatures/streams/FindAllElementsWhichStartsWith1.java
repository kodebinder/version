package com.company.javaeightfeatures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllElementsWhichStartsWith1 {
    public static void main(String[] args) {
        int[] nums = {0, -2, 21, 11, 1, 23, 9};
        List<String> strList = Arrays.stream(nums).boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println(strList);

    }
}
