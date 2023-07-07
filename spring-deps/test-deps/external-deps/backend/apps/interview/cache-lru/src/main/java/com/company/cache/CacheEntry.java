package com.company.cache;

import lombok.Data;

@Data
//Cache Entry in Key, Value Pair
public class CacheEntry {
    private int key;
    private String value;

    public CacheEntry(int key, String value) {
        this.key = key;
        this.value = value;
    }
}