package com.hkdemircan.stream.indermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateMapTest01 {
    // Stream interface, map method;
    // <R> Stream<R> map(Function<? super T, ? extends R> mapper);

    // IntStream interface map method
    // IntStream map(IntUnaryOperator mapper);
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hasan", "kadir", "demircan");
        stream.map(String::length).forEach(System.out::print); // 558
    }
}
