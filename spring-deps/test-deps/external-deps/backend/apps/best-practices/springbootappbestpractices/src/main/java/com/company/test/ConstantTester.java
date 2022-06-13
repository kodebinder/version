package com.company.test;

import java.util.Optional;

public class ConstantTester {
    public static void main(String[] args) {
        ConstantTester obj = new ConstantTester();
        //obj.performThisAction1();
        //obj.performThisAction2();

        if (obj.getProductDetails().isPresent()) {
            System.out.println(obj.getProductDetails().get());
        } else {
            System.out.println("Not Found");
        }

        System.out.println(obj.getProductDetails().orElse("Not Found"));

    }

    public void performThisAction1() {

        String action = performThatAction();

        if (action != null && action.equalsIgnoreCase("SUCCESS")) {
            System.out.println("Action Successful");
        } else {
            System.out.println("Action Failed");
        }
    }

    public void performThisAction2() {

        String action = performThatAction();

        if ("SUCCESS".equalsIgnoreCase(action)) {
            System.out.println("Action Successful");
        } else {
            System.out.println("Action Failed");
        }
    }

    public Optional<String> getProductDetails() {
        String productName = getProductName();
        // productName = null;
        return Optional.ofNullable(productName);
    }

    public String performThatAction() {
        return null;
    }

    private String getProductName() {
        return "IPhone";
    }
}
