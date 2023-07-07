package com.company.solid.eg08.dependencyinversion.problem;

import java.util.List;

public class ShapesPrinter {

    private AreaCalculator areaCalculator = new AreaCalculator();

    public String printJson(List<Shape> shapes) {
        return String.format("%s", "{Shapes Sum: " + areaCalculator.getSumOfAreas(shapes) + "}");
    }

    public String printCsv(List<Shape> shapes) {
        return String.format("%s", "Shapes Sum, " + areaCalculator.getSumOfAreas(shapes));
    }
}
