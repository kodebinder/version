package com.company.solid.eg09.dependencyinversion.solution;

public class NoShape implements Shape {

    @Override
    public double getArea() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
