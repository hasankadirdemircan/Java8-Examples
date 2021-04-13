package com.hkdemircan.stream.indermediate;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateFlatMapTest02 {

    public static void main(String[] args) {
        List<List<Integer>> intsOfInts = Arrays.asList(Arrays.asList(1, 3, 5), Arrays.asList(2, 4));

        intsOfInts.stream()
                .flatMap(Collection::stream)
                .sorted()
                .map(i -> i * i)
                .forEach(System.out::println);

    }
}