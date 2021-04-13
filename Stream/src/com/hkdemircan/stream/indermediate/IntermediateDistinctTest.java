package com.hkdemircan.stream.indermediate;

import java.util.stream.Stream;

public class IntermediateDistinctTest {
    // The distinct() method returns a stream with duplicate values remove
    // Stream<T> distinct();
    public static void main(String[] args) {
        Stream.of("Java", "Java", "Java8", "JAva")
                .distinct()
                .forEach(System.out::println);
    }
}
