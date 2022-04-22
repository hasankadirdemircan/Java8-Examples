package com.hkdemircan._02.concurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionsTest02ZooManagerGoodApproach {
    //ConcurrentHashMap provides higher performance under high read-write operations compared to similar data structures.
    private Map<String, String> foodData = new ConcurrentHashMap<>();

    // its better approach to use ConcurrentHashMap rather than  synchronized
    //These methods are thread-safe.
    public void put(String key, String value) {
        foodData.put(key, value);
    }

    public String get(String key) {
        return foodData.get(key);
    }
}

