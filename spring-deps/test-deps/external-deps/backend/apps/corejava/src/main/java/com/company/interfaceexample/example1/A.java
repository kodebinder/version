package com.company.interfaceexample.example1;

public interface A {

    int count = 10;

    void m1();

    default int sum() {
        return 10;
    }

    static void show(){
        System.out.println("show in A");
    }

    public int hashCode();

    public boolean equals(Object obj);
}
