package com.company.solid.eg04.openclosedprinciple.problem;

import java.util.List;

public class AreaCalculator {

    public int getSumOfAreas(List<Object> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }

            // If we have 10 extra shapes we should not keep on modifying this class
            if (shape instanceof Cube) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
        }
        return sum;
    }
}
