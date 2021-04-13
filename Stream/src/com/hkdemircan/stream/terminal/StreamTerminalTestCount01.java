package com.hkdemircan.stream.terminal;

import java.util.stream.Stream;

public class StreamTerminalTestCount01 {
    //We can only call the Terminal method once on a stream.
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("k1", "k2", "k3");
        long countElement = s1.count();
        System.out.println(countElement);

        // java.lang.IllegalStateException: stream has already been operated upon or
        // closed
        // s1.count();
    }
}
