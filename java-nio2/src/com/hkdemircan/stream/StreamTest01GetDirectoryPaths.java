package com.hkdemircan.stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamTest01GetDirectoryPaths {
    public static void main(String[] args) throws IOException {

        //try-with resource
        try (Stream<Path> entries = Files.list(Paths.get("."))) {
            // entries.forEach(System.out::println);
            //entries.forEach(p -> System.out.println(p.getFileName()));
            entries.forEach(p -> System.out.println(p.toAbsolutePath().normalize()));
        }

        //

        System.out.println("old way!");

        File file = new File(".");
        File[] fileArray = file.listFiles();

        for (File f : fileArray) {
            System.out.println(f.getName());
        }
    }
}
