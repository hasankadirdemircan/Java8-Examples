package com.hkdemircan.stream.advance;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorGroupingByTest01 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears", "horse", "bird", "cat", "cat");
        //
        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        //
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }
}
