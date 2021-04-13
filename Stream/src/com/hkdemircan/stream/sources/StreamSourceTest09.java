package com.hkdemircan.stream.sources;

import java.util.Random;

public class StreamSourceTest09 {
    public static void main(String[] args) {
        // public IntStream ints() {
        new Random().ints().limit(5).forEach(System.out::println);
    }
}
