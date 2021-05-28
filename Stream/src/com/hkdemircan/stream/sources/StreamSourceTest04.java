package com.hkdemircan.stream.sources;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamSourceTest04 {

    public static void main(String[] args) {

        Arrays.stream(Object.class.getMethods()) // source
                .map(Method::getName)            // intermediate op
                .distinct()                      // intermediate op
                .forEach(System.out::println);   // terminal operation

        // open case
        Method[] objectMethods = Object.class.getMethods();
        Stream<Method> objectMethodStream = Arrays.stream(objectMethods);
        Stream<String> objectMethodNames = objectMethodStream.map(method -> method.getName());
        Stream<String> uniqueObjectMethodNames = objectMethodNames.distinct();
        uniqueObjectMethodNames.forEach(System.out::println);
    }
}
/**
 * wait
 * equals
 * toString
 * hashCode
 * getClass
 * notify
 * notifyAll
 */