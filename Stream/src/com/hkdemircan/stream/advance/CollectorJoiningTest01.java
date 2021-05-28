package com.hkdemircan.stream.advance;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorJoiningTest01 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        //
        String result = ohMy.collect(Collectors.joining(", x "));
        System.out.println(result); // lions, tigers, bears
    }
}
