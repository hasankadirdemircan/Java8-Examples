package com.hkdemircan.stream.sources;

import java.util.regex.Pattern;

public class StreamSourceTest08 {
    public static void main(String[] args) {
        //public static Pattern compile(String regex)
        // public Stream<String> splitAsStream(final CharSequence input)
        Pattern.compile(" ")
                .splitAsStream("java 8 streams")
                .forEach(System.out::println);
    }
}
/**
 * java
 * 8
 * streams
 */