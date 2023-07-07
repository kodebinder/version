package com.company.findNthsalaryofEmployee;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SalaryTester {
    public static void main(String[] args) {

        Employee sachin = new Employee(103, "Sachin", 1000.0);
        Employee pooja = new Employee(109, "Pooja", 6000.0);
        Employee priya = new Employee(106, "Priya", 6000.0);
        Employee ganesh = new Employee(108, "Ganesh", 1000.0);
        Employee amit = new Employee(102, "Amit", 1000.0);
        Employee akshay = new Employee(104, "Akshay", 2000.0);
        Employee john = new Employee(105, "John", 5000.0);
        Employee martin = new Employee(101, "Martin", 1000.0);
        Employee pushkar = new Employee(100, "Pushkar", 5000.0);
        Employee riya = new Employee(107, "Riya", 3000.0);

        List<Employee> employees = new LinkedList<>();
        employees.add(sachin);
        employees.add(pooja);
        employees.add(priya);
        employees.add(ganesh);
        employees.add(amit);
        employees.add(akshay);
        employees.add(john);
        employees.add(martin);
        employees.add(pushkar);
        employees.add(riya);

        //    employees.stream().map(Employee::getEmpName).forEach(System.out::println);

        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        employees.stream().map(Employee::getEmpName).forEach(System.out::println);

        System.out.println("\n-----");

        // nth highest salary : second highest salary
        String employeeName = employees.stream().map(Employee::getEmpName).skip(1).findFirst().get();
        System.out.println(employeeName);
    }
}
