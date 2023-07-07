package com.company;

import com.company.cache.LRUCacheImpl;

public class LRUCacheApplication {

    public static void main(String[] args) {

        LRUCacheImpl cache = new LRUCacheImpl();
        cache.putEntryIntoCache(1, "IPhone12");
        cache.putEntryIntoCache(2, "SamsungS22");
        cache.putEntryIntoCache(3, "SonyTv");
        cache.putEntryIntoCache(4, "MacbookPro");

        System.out.println(cache.getFromCache(2));
        System.out.println(cache.getFromCache(6));
    }
}
