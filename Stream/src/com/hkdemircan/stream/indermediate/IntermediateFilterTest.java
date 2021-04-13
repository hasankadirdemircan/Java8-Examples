package com.hkdemircan.stream.indermediate;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateFilterTest {
    // IntStream filter(IntPredicate predicate);
    public static void main(String[] args) {
        IntStream.rangeClosed(0,10)
                .filter(i -> (i % 2 == 0))
                .map(i -> i*3)
                .forEach(System.out::println);

        IntStream.rangeClosed(0,10)
                .filter(EvenFilter::isEven)
                .map(i -> i*3)
                .forEach(System.out::println);

        Stream.of("Hasan", "Kadir", "", "Java")
                .filter(name -> !name.isEmpty()) //Java11 -> Predicate.not(String::isEmpty)
                .forEach(System.out::println);

        Stream.of("Hasan", "Kadir", "", "Java")
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);



        //The filter() method in the Stream interface is used for removing the elements that do not match the given condition.
        //Here is a simple example that uses Stream’s filter() method for removing odd integers
    }
}
class EvenFilter{
    public static boolean isEven(int i) {
        return (i % 2) == 0; }
}
