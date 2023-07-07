package com.company.concurrencyandmultithreading.criticalsection;

public class DecrementThread extends Thread {

    private final InventoryCounter inventoryCounter;

    public DecrementThread(InventoryCounter inventoryCounter) {
        this.inventoryCounter = inventoryCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            inventoryCounter.decrement();
        }
    }
}