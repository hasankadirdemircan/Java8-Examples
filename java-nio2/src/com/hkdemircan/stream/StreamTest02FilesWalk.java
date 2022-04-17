package com.hkdemircan.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamTest02FilesWalk {
    public static void main(String[] args) throws IOException {

        //walk method is looking all directories
        Stream<Path> stream = Files.walk(Paths.get("."));
        stream.forEach(System.out::println);
        stream.close();

        //try-with resource //don't need to close the stream
        try (Stream<Path> stream2 = Files.walk(Paths.get("."))) {
            stream.forEach(System.out::println);
        }


        //  public static Stream<Path> walk(Path start,int maxDepth, FileVisitOption... options)
        Stream<Path> stream2 = Files.walk(Paths.get(".") , 2);
        stream2.forEach(System.out::println);
    }
}
