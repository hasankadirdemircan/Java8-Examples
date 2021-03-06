package com.hkdemircan.stream.indermediate;

import java.util.stream.Stream;

public class IntermediatePeekTest {
    // Stream<T> peek(Consumer<? super T> action);
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i)).count();

        // The peek() method is meant primarily for debugging purposes. It helps us
        // understand how the elements are transformed in the pipeline. Do not use it in
        // production code.
    }
}
