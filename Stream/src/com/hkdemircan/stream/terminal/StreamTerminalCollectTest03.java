package com.hkdemircan.stream.terminal;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalCollectTest03 {

    public static void main(String[] args) {
        Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
                .collect(Collectors.toMap(name -> name, String::length));

        //
        nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));

    }
}
