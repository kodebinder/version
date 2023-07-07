package com.company.interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ImmutableClassTester {
    public static void main(String[] args) {
        Address homeAddress = new Address("Indore", "MP", "India");
        System.out.println("Address Object 1 : " + homeAddress.hashCode());

        List<String> phoneNumbers = new LinkedList<>(Arrays.asList("9826396465", "6362660412"));
        Employee john = new Employee(1, "john", phoneNumbers, homeAddress);
        System.out.println(john);

        phoneNumbers.add("1234567890");

      //john.getPhoneNumbers().add("1234567890");

        Address address = john.getAddress();
        System.out.println("Address Object 2 : " + address.hashCode());

        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setCountry("India");

        System.out.println(john);

    }
}
