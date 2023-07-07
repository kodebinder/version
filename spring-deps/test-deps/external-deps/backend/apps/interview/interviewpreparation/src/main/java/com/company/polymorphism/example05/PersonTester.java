package com.company.polymorphism.example05;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Person {
    private String firstName;
    private String lastName;
}

public class PersonTester {
    public static void main(String[] args) {
        Person p1 = new Person("firstName1", "lastName1");
        Person p2 = new Person("firstName2", "lastName2");

        Map<Person, String> map = new HashMap<>();
        map.put(p1, "This s first");
        map.put(p2, "This s first");
        map.put(new Person("firstName1", "lastName1"), "overriding first");

        System.out.println(map.size()); // 3
        System.out.println(map.get(new Person("firstName1", "lastName1"))); // null
    }
}


