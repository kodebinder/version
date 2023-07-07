package com.company.solid.eg05.openclosedprinciple.solution;

public class Square implements Shape {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }
}
