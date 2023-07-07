package com.company.map.hashmap.example01;

import java.util.HashMap;
import java.util.Map;

public class HashMapTester {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setFirstName("John");
        e1.setLastName("Doe");

        Employee e2 = new Employee();
        e2.setFirstName("John");
        e2.setLastName("Doe");

        Map<Employee, String> employees = new HashMap<>();
        employees.put(e1, e1.getFirstName());
        employees.put(e1, e1.getFirstName());
        employees.put(e1, e1.getLastName());
        employees.put(e1, e1.getLastName());
        employees.put(e2, e2.getFirstName());

        System.out.println(employees.size());
        System.out.println(employees.get(e1));
        System.out.println(employees.get(e2));
    }
}
