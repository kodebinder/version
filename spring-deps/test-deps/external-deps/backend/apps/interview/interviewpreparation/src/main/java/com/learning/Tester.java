package com.learning;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        String str = "testing12322";
        System.out.println(str.chars()
                .mapToObj(x -> (char)x)
                .filter(Character::isDigit)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        Tester tester = new Tester();
        System.out.println(tester.isPowerOf10(10000));

//        Function<String,Integer> functionLength = s -> s.length();
//        System.out.println(functionLength.apply("Pushkar"));

//        int n = 10;
//        Predicate<Integer> predicate = i -> i > 10;
//        System.out.println(predicate.test(20));
    }

//    public boolean isPowerOf10(int n) {
//        int rem = 0;
//        int sum = 0;
//        while (n != 0) {
//            rem = n % 10;
//            if (rem != 0) {
//                return false;
//            }
//            sum = sum + rem;
//            n = n / 10;
//        }
//        return sum == 1;
//    }

//    public boolean isPowerOf10(int n){
//        int rem = 0;
//        int sum = 0;
//        while(n!=0){
//            rem = n%10;
//            sum = sum + rem;
//            n = n/10;
//        }
//        return sum==1;
//    }

    public boolean isPowerOf10(int n){
        if(n==0)
            return false;
        else {
            while(n%10==0)
                n=n/10;
            if(n==1)
                return true;
        }

        return false;
    }
}