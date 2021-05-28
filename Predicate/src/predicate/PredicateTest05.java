package predicate;

import java.util.function.Predicate;

public class PredicateTest05 {

    public static void main(String[] args) {
        Predicate<String> predicate1 = String::isEmpty;
        //boolean dönecek sonuclarda böyle kullanabiliriz.

//		Predicate<String> predicate11 = String::length;
        //compile error, length methodu  geri donusu int.(boolean olmalı.)

        Predicate<String> predicate2 = x -> x.isEmpty();

//		Predicate<String> p13 = String::startsWith;
        //compile error, parametre aliyor.
        //public boolean startsWith(String prefix);

        Predicate<String> predicate3 = (String x) -> {
            return x.isEmpty();
        };

        //    boolean test(T t);
        System.out.println(predicate3.test(""));
        System.out.println(predicate3.test("java"));
    }
}
