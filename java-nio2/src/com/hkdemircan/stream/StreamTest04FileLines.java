package com.hkdemircan.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamTest04FileLines {
    public static void main(String[] args) {
        //lines -> to read the file
        try (Stream<String> stream = Files.lines(Paths.get("lines.txt"))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
