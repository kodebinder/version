package com.company.solid.eg07.interfacesegregation.problem;

import java.util.LinkedList;
import java.util.List;

public class AreaCalculatorTester {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);
        Rectangle rectangle = new Rectangle(10, 10);
        List<Shape> shapes = new LinkedList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(cube);
        shapes.add(rectangle);

        NoShape noShape = new NoShape();
        shapes.add(noShape);

        int sum = areaCalculator.getSumOfAreas(shapes);
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        System.out.println(shapesPrinter.printJson(sum));
        System.out.println(shapesPrinter.printCsv(sum));
    }
}
