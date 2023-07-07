package com.company.polymorphism.example01;

public class ChildClass extends BaseClass {

    public ChildClass() {
        //    System.out.println("Inside public BaseClass() of BaseClass and a: " + a + ", b: " + b);
        System.out.println("Inside public BaseClass() of BaseClass and b: " + b);
    }

    public void show() {
        System.out.println("Inside public void show() of ChildClass");
    }
}
