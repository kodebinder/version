package com.company.solid.eg08.dependencyinversion.problem;

public class NoShape implements Shape {

    @Override
    public double getArea() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
