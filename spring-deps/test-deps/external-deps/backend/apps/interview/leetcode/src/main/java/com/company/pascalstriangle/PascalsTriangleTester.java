package com.company.pascalstriangle;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangleTester {
    public static void main(String[] args) {
        PascalsTriangleTester pascalsTriangle = new PascalsTriangleTester();
        int numberOfRows = 5;
        System.out.println(pascalsTriangle.generate(numberOfRows));
        numberOfRows = 6;
        System.out.println(pascalsTriangle.generate(numberOfRows));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new LinkedList<>();

        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new LinkedList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> row = new LinkedList<>();

            // first element is 1 in every row
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            // last element is 1 in every row
            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }
}
