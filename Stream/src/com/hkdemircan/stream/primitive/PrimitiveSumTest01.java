package com.hkdemircan.stream.primitive;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveSumTest01 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);

        System.out.println(stream.reduce(0, Integer::sum));

        // IntStream mapToInt(ToIntFunction<? super T> mapper);
        // int applyAsInt(T value);
        IntStream is = stream2.mapToInt(x -> x);
        System.out.println(is.sum());
    }
}
