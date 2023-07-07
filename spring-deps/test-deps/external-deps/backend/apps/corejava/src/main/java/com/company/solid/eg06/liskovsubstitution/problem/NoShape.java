package com.company.solid.eg06.liskovsubstitution.problem;

public class NoShape implements Shape {

    @Override
    public double getArea() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
