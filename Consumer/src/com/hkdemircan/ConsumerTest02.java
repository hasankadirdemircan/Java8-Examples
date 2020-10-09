package com.hkdemircan;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest02 {

    public static void main(String[] args) {
        // the forEach method gets the consumer.
        // package java.util.stream; -> void forEach(Consumer<? super T> action);

        // 1. use-case
        Consumer<Integer> c1 = x -> System.out.println(x * 2);
        Stream.of(1,2).forEach(c1);

        // 2. use-case
        Consumer<Integer> c2 = (Integer x) -> System.out.println(x);
        Stream.of(1,2).forEach(c2);

        // 3. use-case
        Stream.of(1,2).forEach(x -> System.out.println(x+2));

        // 4. use-case
        Stream.of(1,2).forEach(System.out::println);

    }
}
/**Outputs:
 2
 4
 1
 2
 3
 4
 1
 2
 */