package com.learning;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*

3) String mobileno = "998966554"

print the numeric number which is not duplicated ....

O/p = numbers = [8,4]

 */
public class Demo {
    public static void main(String[] args) {
        String mobileno = "998966554";
        List<Map.Entry<Character, Long>> numbers = mobileno.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()==1)
                .collect(Collectors.toList());
       // System.out.println(numbers);
        numbers.stream()
                .forEach(e -> System.out.println(e.getKey()));
                //forEach((k,v)-> System.out.println(k + " " + v));
    }
}
