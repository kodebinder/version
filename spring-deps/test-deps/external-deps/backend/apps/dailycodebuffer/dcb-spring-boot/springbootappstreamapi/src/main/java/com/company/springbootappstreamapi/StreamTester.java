package com.company.springbootappstreamapi;

import com.company.springbootappstreamapi.model.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTester {

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shabbir", "Dawoodi", 5000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Nikhil", "Gupta", 6000.0, List.of("Project 1", "Project 3")));
        employees.add(new Employee("Shivam", "Kumar", 5500.0, List.of("Project 3", "Project 4")));

        return employees;
    }

    public static void main(String[] args) {
        StreamTester obj = new StreamTester();
        List<Employee> employees = obj.getEmployees();
        //  employees.stream().forEach(employee -> System.out.println(employee));
        //  employees.forEach(employee -> System.out.println(employee));
        employees.forEach(System.out::println);

        System.out.println("-".repeat(100));

        //map
        //collect
        Set<Employee> increasedSal =
                employees.stream()
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        ))
                        .collect(Collectors.toSet());
        System.out.println(increasedSal);

        System.out.println("-".repeat(100));

        //filter
        //findFirst
        List<Employee> filterEmployee =
                employees
                        .stream()
                        .filter(employee -> employee.getSalary() > 5000.0)
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        ))
                        .collect(Collectors.toList());

        System.out.println(filterEmployee);

        System.out.println("-".repeat(100));

        Employee firstEmployee =
                employees
                        .stream()
                        .filter(employee -> employee.getSalary() > 7000.0)
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        ))
                        .findFirst()
                        .orElse(null);
        System.out.println(firstEmployee);

        System.out.println("-".repeat(100));

        //flatMap
        String projects1 =
                employees
                        .stream()
                        .map(employee -> employee.getProjects())
                        .flatMap(strings -> strings.stream())
                        .collect(Collectors.joining(","));
        System.out.println(projects1);

        System.out.println("-".repeat(100));

        //flatMap
        String projects2 =
                employees
                        .stream()
                        .map(Employee::getProjects)
                        .flatMap(Collection::stream)
                        .collect(Collectors.joining(","));
        System.out.println(projects2);

        System.out.println("-".repeat(100));

        //short Circuit operations
        List<Employee> shortCircuit =
                employees
                        .stream()
                        .skip(1)
                        .limit(1)
                        .collect(Collectors.toList());
        System.out.println(shortCircuit);

        System.out.println("-".repeat(100));

        //Finite Data
        Stream.generate(Math::random)
                .limit(5)
                .forEach(value -> System.out.println(value));

        System.out.println("-".repeat(100));

        //Finite Data
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("-".repeat(100));

        //sorting
        List<Employee> sortedEmployees =
                employees
                        .stream()
                        .sorted((o1, o2) -> o1.getFirstName()
                                .compareToIgnoreCase(o2.getFirstName()))
                        .collect(Collectors.toList());
        System.out.println(sortedEmployees);

        System.out.println("-".repeat(100));

        //min or max
        employees
                .stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

        System.out.println("-".repeat(100));

        //reduce
        Double totalSal1 =
                employees
                        .stream()
                        .map(employee -> employee.getSalary())
                        .reduce(0.0, Double::sum);
        System.out.println(totalSal1);

        System.out.println("-".repeat(100));

        //reduce
        Double totalSal2 =
                employees
                        .stream()
                        .map(Employee::getSalary)
                        .reduce(0.0, Double::sum);
        System.out.println(totalSal2);

        System.out.println("-".repeat(100));
    }

}
