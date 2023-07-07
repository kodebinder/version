package com.company.questionsaskedinstandardchartered.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTester {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee e1 = Employee.builder().id(103).name("Pushkar").salary(3000.0).build();
        Employee e2 = Employee.builder().id(102).name("Vivek").salary(3000.0).build();
        Employee e3 = Employee.builder().id(105).name("Priya").salary(1000.0).build();
        Employee e4 = Employee.builder().id(104).name("Pooja").salary(8000.0).build();
        Employee e5 = Employee.builder().id(101).name("Amar").salary(2000.0).build();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Map<Long, String> employeeCache = employees.stream()
                .collect(Collectors.toMap(Employee::getId,Employee::getName));

    }
}
