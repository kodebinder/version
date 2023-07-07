package com.company.polymorphism;

public class StringStringBufferStringBuilderTester {
    public static void main(String[] args) {
        StringStringBufferStringBuilderTester obj = new StringStringBufferStringBuilderTester();
        // System.out.println(obj.show(null));
         System.out.println(obj.show("data"));
    }

    public String show(String data) {
        System.out.println("Inside public String show(String data)");
        return data;
    }

//    public StringBuffer show(String data) {
//        System.out.println("Inside public StringBuffer show(String data)");
//        return new StringBuffer(data);
//    }
//
//    public StringBuilder show(String data) {
//        System.out.println("Inside public StringBuilder show(String data)");
//        return new StringBuilder(data);
//    }

}
