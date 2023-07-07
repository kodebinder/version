package com.company.solid.eg02.singleresponsibilityprinciple.problem;

import java.util.LinkedList;
import java.util.List;

public class AreaCalculatorTester {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = new LinkedList<>();
        shapes.add(circle);
        shapes.add(square);
        System.out.println(areaCalculator.printJson(shapes));
        System.out.println(areaCalculator.printCsv(shapes));
    }
}
