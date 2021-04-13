package com.hkdemircan.stream.terminal;


import java.util.stream.IntStream;

public class StreamTerminalReduceTest03 {

    public static void main(String[] args) {
        // int reduce(int identity, IntBinaryOperator op);
        int sumTotal = IntStream.of(10, 20, 30, 40).reduce(200, (Integer::sum));

        System.out.println(sumTotal);

    }
}
