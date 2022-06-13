package com.company.springbootapplambdaexpression;

import com.company.springbootapplambdaexpression.model.Person;
import com.company.springbootapplambdaexpression.predicate.CheckPerson;

import java.util.List;
import java.util.function.Predicate;

public class LambdaTester {
    public static void main(String[] args) {
        LambdaTester obj = new LambdaTester();
        List<Person> people = Person.generateDefaultList();
        obj.printPeople(people, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE &&
                        p.getAge() >= 18 &&
                        p.getAge() <= 25;
            }
        });

        System.out.println("-".repeat(100));

        obj.printPeople(people, (p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

        System.out.println("-".repeat(100));

        obj.printPeopleWithPredicate(people, (p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

    }

    public void printPeople(List<Person> people,
                            CheckPerson tester) {
        for (Person p : people) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public void printPeopleWithPredicate(List<Person> people,
                                         Predicate<Person> tester) {
        for (Person p : people) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
