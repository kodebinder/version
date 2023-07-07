package com.company.solid.eg09.dependencyinversion.solution;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String printJson(List<Shape> shapes) {
        return String.format("%s", "{Shapes Sum: " + areaCalculator.getSumOfAreas(shapes) + "}");
    }

    public String printCsv(List<Shape> shapes) {
        return String.format("%s", "Shapes Sum, " + areaCalculator.getSumOfAreas(shapes));
    }
}
