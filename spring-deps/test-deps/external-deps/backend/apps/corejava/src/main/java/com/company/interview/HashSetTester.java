package com.company.interview;

import java.util.HashSet;
import java.util.Set;

public class HashSetTester {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean b1 = set.add("P");
        boolean b2 = set.add("U");
        boolean b3 = set.add("P");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
