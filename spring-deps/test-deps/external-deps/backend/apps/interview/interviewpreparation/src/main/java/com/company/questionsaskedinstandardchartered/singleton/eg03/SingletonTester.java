package com.company.questionsaskedinstandardchartered.singleton.eg03;

import java.io.*;

public class SingletonTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("DateUtil.ser");

        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(dateUtil1);

        DateUtil dateUtil2;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        dateUtil2 = (DateUtil) ois.readObject();

        ois.close();
        oos.close();

        System.out.println(dateUtil1.hashCode());
        System.out.println(dateUtil2.hashCode());

    }
}
