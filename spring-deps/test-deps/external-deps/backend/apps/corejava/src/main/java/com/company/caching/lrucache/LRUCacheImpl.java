package com.company.caching.lrucache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheImpl {

    private static final int CACHE_SIZE = 3;
    private final Deque<CacheEntry> q = new LinkedList<>();
    private final Map<Integer, CacheEntry> map = new HashMap<>();

    public String getFromCache(int key) {
        if(map.containsKey(key)) {
            CacheEntry entry = map.get(key);
            q.remove(entry);
            q.addFirst(entry);
            return entry.value;
        }
        return null;
    }

    public void putEntryIntoCache(int key, String value) {
        if(map.containsKey(key)) {
            CacheEntry entry = map.get(key);
            q.remove(entry);
        } else {
            if(q.size() == CACHE_SIZE) {
                CacheEntry entryToBeRemoved = q.removeLast();
                map.remove(entryToBeRemoved.key);
            }
        }

        CacheEntry newEntry = new CacheEntry(key, value);
        q.addFirst(newEntry);
        map.put(key, newEntry);
    }

    public static void main(String[] args) {

        LRUCacheImpl cache = new LRUCacheImpl();
        cache.putEntryIntoCache(1, "com.company.stringhandling.Product-1-Info");
        cache.putEntryIntoCache(2, "com.company.stringhandling.Product-2-Info");
        cache.putEntryIntoCache(3, "com.company.stringhandling.Product-3-Info");
        cache.putEntryIntoCache(4, "com.company.stringhandling.Product-4-Info");

        System.out.println(cache.getFromCache(2));
        System.out.println(cache.getFromCache(6));

    }

}
