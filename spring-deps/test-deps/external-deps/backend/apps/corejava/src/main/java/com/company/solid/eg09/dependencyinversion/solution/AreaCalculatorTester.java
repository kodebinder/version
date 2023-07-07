package com.company.solid.eg09.dependencyinversion.solution;

import java.util.LinkedList;
import java.util.List;

public class AreaCalculatorTester {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
    //  IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);
        Rectangle rectangle = new Rectangle(10, 10);
        List<Shape> shapes = new LinkedList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(cube);
        shapes.add(rectangle);
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        System.out.println(shapesPrinter.printJson(shapes));
        System.out.println(shapesPrinter.printCsv(shapes));
    }
}
