package com.hkdemircan.stream.indermediate;

import java.util.stream.Stream;

public class IntermediateSkipAndLimitTest {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.iterate(10, n -> n + 2);

        s.skip(3).limit(2).forEach(System.out::println);
    }
}
