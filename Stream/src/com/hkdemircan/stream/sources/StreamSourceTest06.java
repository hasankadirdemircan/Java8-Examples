package com.hkdemircan.stream.sources;

import java.util.stream.IntStream;

public class StreamSourceTest06 {

    public static void main(String[] args) {
        IntStream.iterate(10, i -> i + 5).limit(6).forEach(System.out::println);
    }
}
