package com.company.solid.eg04.openclosedprinciple.problem;

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
        int sum = areaCalculator.getSumOfAreas(shapes);
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        System.out.println(shapesPrinter.printJson(sum));
        System.out.println(shapesPrinter.printCsv(sum));
    }
}
