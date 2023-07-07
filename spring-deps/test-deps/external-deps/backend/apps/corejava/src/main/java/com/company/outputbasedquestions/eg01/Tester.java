package com.company.outputbasedquestions.eg01;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) throws Exception {
        char[] chars = new char[]{'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
// [63] on windows
// https://www.anyforum.in/question/corejava/string-handling/What-does-the-following-Java-program-print/591