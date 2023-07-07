package com.company.solid.eg04.openclosedprinciple.problem;

public class Cube {

    private final int side_length;

    public Cube(int side_length) {
        this.side_length = side_length;
    }

    public int getSideLength() {
        return side_length;
    }
}
