package com.hkdemircan.stream.terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamTerminalTestFindAnyFindFirst01 {

    // Optional<T> findFirst();
    // Optional<T> findAny();

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println); // monkey

        infinite.findAny().ifPresent(System.out::println); // chimp
    }
}
