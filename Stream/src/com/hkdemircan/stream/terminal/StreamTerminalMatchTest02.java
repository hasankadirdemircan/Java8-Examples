package com.hkdemircan.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTerminalMatchTest02 {

    public static void main(String[] args) {
        // Average temperatures in Concordia, Antarctica in a week in October 2015
        boolean anyMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).anyMatch(temp -> temp > 0);
        System.out.println("anyMatch(temp -> temp > 0): " + anyMatch);
        // hic biri eslesmiyor anyMatch -> false olur.

        boolean allMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).allMatch(temp -> temp > 0);
        System.out.println("allMatch(temp -> temp > 0): " + allMatch);

        boolean noneMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).noneMatch(temp -> temp > 0);
        System.out.println("noneMatch(temp -> temp > 0): " + noneMatch);
        // hic biri eslesmiyor bu nedenle nonMatch true!

    }
}
