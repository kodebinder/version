package com.company.solid.eg08.dependencyinversion.problem;

public class Cube implements Shape, ThreeDimensionalShape {

    private final int side_length;

    public Cube(int side_length) {
        this.side_length = side_length;
    }

    public int getSideLength() {
        return side_length;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getSideLength(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getSideLength(), 3);
    }
}
