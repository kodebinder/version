package com.company.concurrencyandmultithreading.criticalsection;

public class IncrementThread extends Thread {

    private final InventoryCounter inventoryCounter;

    public IncrementThread(InventoryCounter inventoryCounter) {
        this.inventoryCounter = inventoryCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            inventoryCounter.increment();
        }
    }
}