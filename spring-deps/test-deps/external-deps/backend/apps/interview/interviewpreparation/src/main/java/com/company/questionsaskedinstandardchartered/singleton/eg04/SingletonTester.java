package com.company.questionsaskedinstandardchartered.singleton.eg04;

import java.io.*;

public class SingletonTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DBManager dbManager1 = DBManager.INSTANCE;
        DBManager dbManager2 = DBManager.INSTANCE;

        System.out.println(dbManager1.hashCode());
        System.out.println(dbManager2.hashCode());

    }
}
