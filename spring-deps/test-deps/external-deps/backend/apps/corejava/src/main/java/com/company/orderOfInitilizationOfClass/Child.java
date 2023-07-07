package com.company.orderOfInitilizationOfClass;

public class Child extends Parent {

    private static int AGE = 30;

    private int c;

    static {
        System.out.println("child : static initialization block");
        AGE = 90;
    }

    {
        System.out.println("child : non static initialization block");
        c = 44;
    }

    public Child(int c) {
        System.out.println("child : parameterized constructor");
        this.c = c;
    }

    public Child() {
        System.out.println("child : constructor");
        this.c = c;
    }
}
