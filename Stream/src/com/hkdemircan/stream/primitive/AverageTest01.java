package com.hkdemircan.stream.primitive;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageTest01 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        OptionalDouble optionalDouble = intStream.average();
        System.out.println(optionalDouble);
    }
}
