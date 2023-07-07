package com.company.immutableclass.whyimmutableclassfinal.problem;

import java.util.HashMap;
import java.util.Map;

public class ImmutableTester {
    public static void main(String[] args) {

        Employee rajiv = new Employee("Rajiv", "Bhatia");
        Map<Employee, String> employees = new HashMap<>();
        employees.put(rajiv, rajiv.getFirstName() + "-" + rajiv.getLastName());

        Employee akshay = new Employee("Akshay", "Kumar");
        rajiv = akshay;

        System.out.println(employees.get(rajiv));
    }
}
