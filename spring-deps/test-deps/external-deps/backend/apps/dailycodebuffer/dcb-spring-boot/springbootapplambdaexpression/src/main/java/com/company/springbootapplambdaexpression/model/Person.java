package com.company.springbootapplambdaexpression.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    public void printPerson() {
        System.out.println(this);
    }

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    int age;
    Sex gender;
    String emailAddress;

    public static List<Person> generateDefaultList() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Shabbir", 20, Sex.MALE, "shabbir@gmail.com"));
        people.add(new Person("Pooja", 21, Sex.FEMALE, "pooja@gmail.com"));
        people.add(new Person("Amit", 19, Sex.MALE, "amit@gmail.com"));
        return people;
    }
}