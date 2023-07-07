package com.company.solid.eg04.openclosedprinciple.problem;

public class Circle {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}