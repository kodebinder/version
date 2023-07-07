package com.company.interview;

import lombok.ToString;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@ToString
final public class Employee {
    private final int id;
    private final String empName;
    private final List<String> phoneNumbers;
    private final Address address;

    public Employee(int id, String empName, List<String> phoneNumbers, Address address) {
        this.id = id;
        this.empName = empName;
        this.phoneNumbers = Collections.unmodifiableList(new LinkedList<>(phoneNumbers));
        this.address = address;
    }

    // no setter methods and only getter methods

    public int getId() {
        return id;
    }

    public String getEmpName() {
        return empName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Address getAddress() {
        return Address.getInstance(this.address);
    }
}
