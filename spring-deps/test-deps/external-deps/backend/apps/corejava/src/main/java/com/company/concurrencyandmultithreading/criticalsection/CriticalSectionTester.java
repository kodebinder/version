package com.company.concurrencyandmultithreading.criticalsection;

public class CriticalSectionTester {
    public static void main(String[] args) throws InterruptedException {
        InventoryCounter inventoryCounter = new InventoryCounter();
        IncrementThread incrementingThread = new IncrementThread(inventoryCounter);
        DecrementThread decrementingThread = new DecrementThread(inventoryCounter);

        incrementingThread.start();
        decrementingThread.start();

        incrementingThread.join();
        decrementingThread.join();

        System.out.println("We currently have " + inventoryCounter.getItems() + " items");
    }

}
