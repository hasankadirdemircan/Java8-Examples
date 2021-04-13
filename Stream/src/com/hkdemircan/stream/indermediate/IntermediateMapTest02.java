package com.hkdemircan.stream.indermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateMapTest02 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println("original list: " + numbers);

        List<Integer> even = numbers.stream()
                .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("processed list, only even numbers: " + even);
    }
}
