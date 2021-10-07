package com.hkdemircan;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class OptionalTest08 {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3);
        selectHighestTemperature(stream);
        selectHighestTemperature(DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
    }

    public static void selectHighestTemperature(Stream<Double> temperatures) {
        Optional<Double> max = temperatures.max(Double::compareTo);
        max.ifPresent(System.out::println);
    }

    public static void selectHighestTemperature(DoubleStream temperatures){
        OptionalDouble max = temperatures.max();
        max.ifPresent(System.out::println);
    }
}
