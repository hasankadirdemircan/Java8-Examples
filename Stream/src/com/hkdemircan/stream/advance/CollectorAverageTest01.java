package com.hkdemircan.stream.advance;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorAverageTest01 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");

        Double result = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result);
    }
}
