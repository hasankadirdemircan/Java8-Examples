package com.hkdemircan.stream.indermediate;

import java.util.stream.Stream;

public class IntermediateInfiniteTest01 {

    public static void main(String[] args) {
        // public static<T> Stream<T> generate(Supplier<T> s) {
        // Stream.generate(() -> "Elsa")
        // .filter(n -> n.length() == 4)
        // .sorted()
        // .limit(2).forEach(System.out::println);

        // java.lang.OutOfMemoryError: Java heap space

        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }
}
