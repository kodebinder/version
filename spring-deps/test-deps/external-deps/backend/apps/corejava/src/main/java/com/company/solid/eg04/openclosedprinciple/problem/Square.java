package com.company.solid.eg04.openclosedprinciple.problem;

public class Square {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
