package com.company.interview;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTester {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("P");
        list.add("U");
        list.add("S");
        list.add("H");
    }
}
