package com.hkdemircan;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest05 {
    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> incrementExact = Math::incrementExact;

        Function<String, Integer> parseIntAndIncrecementExact = parseInt.andThen(incrementExact);
        Function<String, Integer> compose = incrementExact.compose(parseInt);
        //compose -> firstly it start within and then make outside.
        //so -> start parseInt -> incrementExact

        //the map () is used to transform one object into another by applying a function.
        Stream.of("-3", "11", "25", "30", "-1", "-11").map(parseIntAndIncrecementExact).forEach(System.out::println);

        System.out.println("-------------------------------------");
        List<String> alpha = Arrays.asList("a a", "b b", "c c", "d d");
        Function<String, String> upperCase = String::toUpperCase;

        alpha.stream().map(upperCase).forEach(System.out::println);
        System.out.println("--------------short use--------------");
        //short use
        alpha.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
/**
 * Outputs:
 * -2
 * 12
 * 26
 * 31
 * 0
 * -10
 * -------------------------------------
 * A A
 * B B
 * C C
 * D D
 * --------------short use--------------
 * A A
 * B B
 * C C
 * D D
 */
