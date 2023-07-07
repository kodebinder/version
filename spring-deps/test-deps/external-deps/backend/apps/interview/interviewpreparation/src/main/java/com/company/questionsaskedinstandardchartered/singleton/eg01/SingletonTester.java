package com.company.questionsaskedinstandardchartered.singleton.eg01;

public class SingletonTester {
    public static void main(String[] args) {
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();
        System.out.println(dateUtil1.hashCode());
        System.out.println(dateUtil2.hashCode());
    }
}
