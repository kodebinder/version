package com.company.interview;

import static java.lang.Thread.sleep;

public class DeadlockTester {
    public static void main(String[] args) {
        String lock1 = "John";
        String lock2 = "Adams";

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("lock acquired");
                }
            }
        }, "thread-1");

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("lock acquired");
                }
            }
        }, "thread-2");

        t1.start();
        t2.start();
    }
}





// https://www.youtube.com/watch?v=WldMTtUWqTg&t=6038s