package com.company.customhashmap;

public class CustomHashMapTester {
    public static void main(String[] args) {
        CustomHashMap<String, String> capitals = new CustomHashMap<>();
        capitals.put("Maharashtra","Mumbai");
        capitals.put("Karnataka","Bengaluru");
        capitals.put("MP","Bhopal");

        System.out.println(capitals.get("MP"));
    }
}
