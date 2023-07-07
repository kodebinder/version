package com.company.solid.eg05.openclosedprinciple.solution;

public class ShapesPrinter {

    public String printJson(int sum) {
        return String.format("%s", "{Shapes Sum: " + sum + "}");
    }

    public String printCsv(int sum) {
        return String.format("%s", "Shapes Sum, " + sum);
    }
}
