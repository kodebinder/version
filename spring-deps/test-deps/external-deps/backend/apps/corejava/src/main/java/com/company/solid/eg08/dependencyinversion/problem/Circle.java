package com.company.solid.eg08.dependencyinversion.problem;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}