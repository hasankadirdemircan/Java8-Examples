package com.hkdemircan._02.concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentCollectionTest03ModifyList {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        Iterator<String> listIter = aList.iterator();
        //ArrayList are fail-fast. That's why we get an error java.util.ConcurrentModificationException
        //we should use -> new CopyOnWriteArrayList<>(); -> Look at ConcurrentCollectionTest04COWList.java
        while(listIter.hasNext()) {
            System.out.println(listIter.next());
            aList.add("four");
            // java.util.ConcurrentModificationException
        }
    }
}
