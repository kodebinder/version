package com.company.learnjava.functionalInterfaces;

import com.company.learnjava.data.Student;
import com.company.learnjava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    private static Map<String, String> loginPageLocs = new HashMap<>();


    static BiFunction<List<Student>,Predicate<Student>,Map<String, Double>> biFunction = (students, studentPredicate)->{

        Map<String,Double> studentGradeMap = new HashMap<>();
        students.forEach((student -> {

            if(studentPredicate.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        }));

        return studentGradeMap;

    };

    public static String getLoginLocs(String sLocator, String elementType) {

        return loginPageLocs.get(elementType);
    }

    static BiFunction<String,String,String> getLoginLocs = (sLocator,elementType) -> loginPageLocs.get(sLocator);

    public static void main(String[] args) {

        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p2));

        getLoginLocs.apply("locator","elementType");

    }
}
