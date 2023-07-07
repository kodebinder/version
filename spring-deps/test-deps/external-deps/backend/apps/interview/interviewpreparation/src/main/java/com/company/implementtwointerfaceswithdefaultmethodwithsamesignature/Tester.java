package com.company.implementtwointerfaceswithdefaultmethodwithsamesignature;

public class Tester implements DefaultMethodInterface01, DefaultMethodInterface02 {
    public static void main(String[] args) {
        DefaultMethodInterface01 defaultMethodInterface01 = new Tester();
        defaultMethodInterface01.defaultMethod();
    }

    @Override
    public void defaultMethod() {
        DefaultMethodInterface01.super.defaultMethod();
    }
}
