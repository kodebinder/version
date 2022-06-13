package com.company.springbootapplambdaexpression.predicate;


import com.company.springbootapplambdaexpression.model.Person;

@FunctionalInterface
public interface CheckPerson {
    boolean test(Person p);
}