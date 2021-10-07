package com.hkdemircan;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<String> nullStr = Optional.of(null);

        System.out.println(nullStr); // java.lang.NullPointerException

        //solution
        nullStr.ifPresent(System.out::println);
    }
}
