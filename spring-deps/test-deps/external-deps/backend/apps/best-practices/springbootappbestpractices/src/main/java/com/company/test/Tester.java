package com.company.test;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        Tester obj = new Tester();
        obj.testString();

        System.out.println("-".repeat(100));

        obj.testStringUtils();
    }

    private void testString() {
        BigDecimal salary = getSalary();
        // salary = null;
        System.out.println(String.valueOf(salary));
        System.out.println(salary.toString());
    }

    private BigDecimal getSalary() {
        return new BigDecimal(100.0);
    }

    private void testStringUtils() {
        //StringUtils methods are null safe, they don't throw NullPointerException
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isNumeric(null));
        System.out.println(StringUtils.isAllUpperCase(null));
        System.out.println(StringUtils.isWhitespace(null));

        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isNumeric(""));
        System.out.println(StringUtils.isAllUpperCase(""));
        System.out.println(StringUtils.isWhitespace(""));

        System.out.println(StringUtils.isEmpty(" "));
        System.out.println(StringUtils.isBlank(" "));
        System.out.println(StringUtils.isNumeric(" "));
        System.out.println(StringUtils.isAllUpperCase(" "));
        System.out.println(StringUtils.isWhitespace(" "));
    }

    private List getOrders() {
        List list = Collections.EMPTY_LIST;
        return list;
    }
}
/*
https://javarevisited.blogspot.com/2013/05/ava-tips-and-best-practices-to-avoid-nullpointerexception-program-application.html#axzz7OXd2qX3D
1. Prefer String.valueOf(str) over str.toString()
2. Prefer StringUtils.isBlank(str) over StringUtils.isEmpty(str)
3. Prefer primitives over wrapper types
* */