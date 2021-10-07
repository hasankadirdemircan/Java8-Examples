package com.hkdemircan;

import java.util.Optional;

public class OptionalTest03 {
    public static void main(String[] args) {
        /**
         * This will result in throwing a NullPointerException.
         * If you want to create an Optional object that has null value, then you can instead use ofNullable() method:
         */
        Optional<String> nullable = Optional.ofNullable(null);
        System.out.println(nullable);

    }
}
