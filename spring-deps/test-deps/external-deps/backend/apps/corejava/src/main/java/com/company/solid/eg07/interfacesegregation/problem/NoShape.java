package com.company.solid.eg07.interfacesegregation.problem;

public class NoShape implements Shape {

    @Override
    public double getArea() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
