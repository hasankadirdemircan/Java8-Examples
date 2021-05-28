package com.hkdemircan.stream.primitive;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamTest02 {
    public static void main(String[] args) {
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(String::length);

        intStream.forEach(System.out::println);
    }
}
