package com.company.orderOfInitilizationOfClass;

public class Parent {

    private static int AGE = 5;

    private int a;
    private int b;

    static {
        System.out.println("parent: static initialization block");
        AGE = 50;
    }

    {
        System.out.println("parent: non static initialization block");
        a = 100;
        b = Math.abs(a * 10) + AGE;
    }

    public Parent(int a) {
        System.out.println("parent: parameterized constructor");
        this.a = a;
    }

    public Parent() {
        System.out.println("parent: constructor");
        this.a = a;
    }
}
