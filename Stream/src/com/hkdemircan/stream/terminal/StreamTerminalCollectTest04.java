package com.hkdemircan.stream.terminal;

import java.util.stream.Stream;

public class StreamTerminalCollectTest04 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

        System.out.println(word);
    }
}
