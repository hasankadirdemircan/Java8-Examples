package com.hkdemircan;

import java.util.Optional;

public class OptionalTest07 {

    public static void main(String[] args) {
        Optional<Integer> opt = Optional.of(120);
        threeDigitV1(opt);
        threeDigitV2(opt);
    }

    private static void threeDigitV1(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3){
                System.out.println(string);
            }
        }
    }

    private static void threeDigitV2(Optional<Integer> optional){
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }
}
