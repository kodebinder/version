package com.company.interview;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapTester {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> concurrentMap = new ConcurrentHashMap<>();
        String str = "ABCD ABCD ABC";
        for (char character : str.toCharArray()) {
//            LongAdder longAdder = concurrentMap.get(c);
//            if (Objects.isNull(longAdder)) {
//                longAdder = new LongAdder();
//            }
//            longAdder.increment();
//            concurrentMap.put(c, longAdder);
            concurrentMap.computeIfAbsent(character,c -> new LongAdder()).increment();
        }
        System.out.println(concurrentMap);
    }
}
