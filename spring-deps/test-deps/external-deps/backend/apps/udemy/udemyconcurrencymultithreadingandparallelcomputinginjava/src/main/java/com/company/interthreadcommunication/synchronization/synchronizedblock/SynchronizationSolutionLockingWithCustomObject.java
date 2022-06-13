package com.company.interthreadcommunication.synchronization.synchronizedblock;

// creating custom independent object by creating final locks
public class SynchronizationSolutionLockingWithCustomObject {
    public static int counter1 = 0;
    public static int counter2 = 0;

    // Locking Synchronized Blocks using Custom Object which are final
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    // class level lock : we synchronize block that are 100% necessary
    public static void increment1(){
        synchronized (lock1){
            counter1++;
        }
    }

    public static synchronized void increment2(){
        synchronized (lock2){
            counter2++;
        }
    }

    public static void process() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment1();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment2();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter1 : " + counter1);
        System.out.println("Counter2 : " + counter2);
    }

    public static void main(String[] args) throws InterruptedException {
        process();
    }
}
