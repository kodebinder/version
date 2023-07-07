package com.company.solid.eg09.dependencyinversion.solution;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public int getSumOfAreas(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum += shape.getArea();
        }
        return sum;
    }
}
