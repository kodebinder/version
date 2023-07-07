package com.company.concurrencyandmultithreading.threadtermination;

public class Main1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());
        thread.start();
    }

    private static class BlockingTask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Existing blocking thread");
            }
        }
    }
}
