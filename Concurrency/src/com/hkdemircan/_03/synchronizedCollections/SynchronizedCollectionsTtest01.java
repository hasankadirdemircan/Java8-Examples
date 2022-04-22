package com.hkdemircan._03.synchronizedCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionsTtest01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> scynchronizedList = Collections.synchronizedList(numbers);

        //What is the difference between Collections.synchronizedList and Concurrent Collection?
        //When we use synchronized keyword,

//		synchronized(this) {
//			numbers.add(....);

        //one thread works in the method. just method is blocked.
        //But when we use Collections.synchronizedList, all collection will be locked.

        //For Concurrent Collection
        // more than 1 thread may work on the same collection.
        // lock mechanism is not on all collection.
        // The logic here is that more than one thread cannot run/work on the same element/index.

    }
}
