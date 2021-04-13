package com.hkdemircan.stream.sources;

import java.util.stream.Stream;

public class StreamSourceTest03 {

    public static void main(String[] args) {

        Stream<Double> randoms = Stream.generate(Math::random).limit(5);

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2).limit(5);
    }
}
