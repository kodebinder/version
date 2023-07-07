package com.company.polymorphism;

public class IntegerintTester {
    public static void main(String[] args) {
        IntegerintTester obj = new IntegerintTester();
        System.out.println(obj.show(10));
    }

    public Integer show(Integer data) {
        System.out.println("Inside public Integer show(Integer data)");
        return data;
    }

    public int show(int data) {
        System.out.println("Inside public int show(int data)");
        return data;
    }
}
// int > Integer