package com.company.polymorphism.example02;

class MyAdd<T> {

    void add(T t) {

        System.out.println(t);

    }

}

public class PolymorphismTester {
    public static void main(String[] args) {

        MyAdd<Integer> m = new MyAdd<>();

//        m.add(Integer.valueOf(1));
//
//        m.add(Double.valueOf(1.0));

    }

}