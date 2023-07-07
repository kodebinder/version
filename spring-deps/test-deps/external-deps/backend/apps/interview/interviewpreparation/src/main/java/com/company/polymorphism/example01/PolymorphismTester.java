package com.company.polymorphism.example01;

public class PolymorphismTester {
    public static void main(String[] args) {
//        BaseClass baseClass = new BaseClass();
//        baseClass.show();

//        ChildClass childClass = new ChildClass();
//        childClass.show();

        BaseClass baseClass = new ChildClass();
        baseClass.show();
    }
}
