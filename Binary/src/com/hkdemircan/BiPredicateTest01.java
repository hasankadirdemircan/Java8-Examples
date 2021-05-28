package com.hkdemircan;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateTest01 {
    // public interface BiPredicate<T, U> {
    // boolean test(T t, U u);

    public static void main(String[] args) {

        BiPredicate<String, Integer> biPredicate1 = (String str, Integer i) -> str.length() > i;
        System.out.println(filterBiPredicate("java8", 5, biPredicate1));
        System.out.println(filterBiPredicate("biPredicate", 5, biPredicate1));

        // boolean contains(Object o);
        BiPredicate<List<Integer>, Integer> listContains = List::contains;

        List integerList = Arrays.asList(40, 45, 50);
        filterList(integerList, 45, listContains);
    }

    static boolean filterBiPredicate(String a, Integer b, BiPredicate<String, Integer> biPredicate) {
        return biPredicate.test(a, b);
    }

    static boolean filterList(List integerList, Integer expectValue, BiPredicate<List<Integer>, Integer> biPredicate) {
        return biPredicate.test(integerList, expectValue);
    }
}
/**
 * false
 * true
 */