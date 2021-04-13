package com.hkdemircan.stream.terminal;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamTerminalCollectTest02 {

    public static void main(String[] args) {
        String[] roseQuote = "a rose is a rose is a rose".split(" ");
        Set<String> words = Arrays.stream(roseQuote).collect(Collectors.toSet());

        System.out.println(words);

    }
}
