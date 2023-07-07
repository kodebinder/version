package com.learning;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Employee(String name, int salary, String loc, String dept)

Employe('a',1000,'hyd','x')

Employe('b',2000,'blr','y')

Employe('c',3000,'delhi','x')

Employe('d',4000,'noida','z')

1) write a java program to display max employees belongs to the dept and avg salary of dept

2) write sql query to display above one
 */
public class Tester {
    public static void main(String[] args) {
        Employee a = new Employee("a",1000,"hyd","x");
        Employee b = new Employee("b",2000,"blr","y");
        Employee c = new Employee("c",3000,"delhi","x");
        Employee d = new Employee("d",4000,"noida","z");

        List<Employee> employees = new ArrayList<>();
        employees.add(a);
        employees.add(b);
        employees.add(c);
        employees.add(d);

        Optional<Map.Entry<String, Long>> optionalEntry = employees.stream()
                .map(Employee::getDept)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .max(Comparator.comparing(e -> e.getValue()));
        if(optionalEntry.isPresent()){
            Map.Entry<String, Long> entry = optionalEntry.get();
            System.out.println(entry.getKey());
        }
    }
}
/*
select avg(salary) from employees group by department  ;
 */