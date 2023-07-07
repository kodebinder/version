package com.company.solid.eg07.interfacesegregation.problem;

import java.util.List;

public class AreaCalculator {

    public int getSumOfAreas(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum += shape.getArea();
        }
        return sum;
    }
}
