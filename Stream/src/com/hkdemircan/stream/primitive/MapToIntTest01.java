package com.hkdemircan.stream.primitive;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToIntTest01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("2", "3", "5");
        IntStream intStream = stream.mapToInt(Integer::parseInt);
        System.out.println(intStream.sum());
    }
}
