package com.hkdemircan;

import java.util.function.Function;

public class FunctionTest01 {
    // package java.util.function;
    // public interface Function<T, R>
    // R apply(T t);
    // It is combined with the map method found in the stream.
    public static void main(String[] args) {

        // 2 different uses with lambda
        Function<String, Integer> lengthFunction1 = e -> e.length();
        Function<String, Integer> lengthFunction2 = (String e) -> e.length();

        int result1 = lengthFunction1.apply("java8");
        int result2 = lengthFunction1.apply("functioninterface");
        int result3 = lengthFunction1.apply("hkdemircan");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
/**
 * Outputs:
 * 798
 * 5000
 * 600
 * 700
 */
