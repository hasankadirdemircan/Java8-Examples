package com.hkdemircan;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest02 {

    // public static<T> Stream<T> generate(Supplier<? extends T> s)
    public static void main(String[] args) {
        Supplier<Integer> supplier01 = () -> new Random().nextInt(20);
        Stream.generate(supplier01).limit(5).forEach(System.out::println);

        System.out.println("---------------");
        Supplier<Integer> supplier02 = new Random()::nextInt;
        Stream.generate(supplier02).limit(6).filter(number -> number > 5).forEach(System.out::println);

        //similar 16.line
        Supplier<Integer> supplier03 = SupplierTest02::createRandomNumber;

    }

    public static Integer createRandomNumber() {
        return new Random().nextInt();
    }
}
/**
 * 5
 * 1
 * 2
 * 19
 * 19
 * ---------------
 * 920832475
 * 320474040
 */
