package com.company.javaeightfeatures.streams;

import java.util.Arrays;

public class FindLongestStringFromAnArray {
    public static void main(String[] args) {
        String[] technologies = {"java", "php", "docker", "csharp", "python"};
        String longestString = Arrays.stream(technologies)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);
    }
}
