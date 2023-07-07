package com.company.solid.eg05.openclosedprinciple.solution;

public class Rectangle implements Shape {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }
}
