package com.hkdemircan.stream.sources;

public class StreamSourceTest10 {
    public static void main(String[] args) {
        // public IntStream chars() {
        "hello".chars().sorted().forEach(ch -> System.out.printf("%c ", ch));
    }
}
