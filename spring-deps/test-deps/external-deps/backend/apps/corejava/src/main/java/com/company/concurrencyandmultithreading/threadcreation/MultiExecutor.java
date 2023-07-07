package com.company.concurrencyandmultithreading.threadcreation;

import java.util.ArrayList;
import java.util.List;
 
public class MultiExecutor {
    
    private final List<Runnable> tasks;
 
    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        this.tasks = tasks;
    }
 
    /**
     * Executes all the tasks concurrently
     */
    public void executeAll() {
        List<Thread> threads = new ArrayList<>(tasks.size());
        
        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
        }
        
        for(Thread thread : threads) {
            thread.start();
        }
    }
}
