package com.company.polymorphism.example01;

public class BaseClass {

    private static int a = 10;
    int b = 20;

    final public int c = 0;

    public BaseClass() {
        a = a + 1;
        b = b + 1;
        //  c = c + 1;
        System.out.println("Inside public BaseClass() of BaseClass and a: " + a + ", b: " + b);
    }

    public void show() {
        a = a + 1;
        b = b + 1;
        //  c = c + 1;
        System.out.println("Inside public void show() of BaseClass and a: " + a + ", b: " + b);
    }
}
