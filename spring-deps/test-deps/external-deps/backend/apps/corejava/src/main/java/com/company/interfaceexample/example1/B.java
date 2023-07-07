package com.company.interfaceexample.example1;

public interface B {

    int count = 20;
    void m1();

    default int sum() {
        return count;
    }

    public int hashCode();

    public boolean equals(Object obj);
}
