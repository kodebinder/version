package com.company.polymorphism.example03;

class Parent {

    static {
        System.out.println("parent static");
    }

    {
        System.out.println("parent initi");
    }

    public Parent() {
        System.out.println("parent cons");
    }

}


class Child extends Parent {

    static {
        System.out.println("child static");
    }

    {
        System.out.println("child initi");
    }

    public Child() {
        System.out.println("child cons");
    }

}


public class PolymorphismTester {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
// static block of parent then child
// parent block
// parent cons
// child block
// child cons