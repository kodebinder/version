package com.company.cache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheImpl {

    // insertion and deletion at both ends
    private Deque<CacheEntry> queue = new LinkedList<>();
    private Map<Integer, CacheEntry> map = new HashMap<>();
    private final int CACHE_SIZE = 3;

    /**
     * Check if key present in cache,
     * remove from queue,
     * add to queue as it is recently used
     * else return null if key absent in cache
     *
     * @return String
     */
    public String getFromCache(int key) {

        if (map.containsKey(key)) {
            CacheEntry entry = map.get(key);
            queue.remove(entry);
            queue.addFirst(entry);
            return entry.getValue();
        }

        return null;
    }

    public void putEntryIntoCache(int key, String value) {
        if (map.containsKey(key)) {
            CacheEntry entry = map.get(key);
            queue.remove(entry);
        } else {
            // If Cache is full remove last element from cache
            if (queue.size() == CACHE_SIZE) {
                CacheEntry entryToBeRemoved = queue.removeLast();
                map.remove(entryToBeRemoved.getKey());
            }
        }

        CacheEntry newEntry = new CacheEntry(key, value);
        queue.addFirst(newEntry);
        map.put(key, newEntry);
    }

}