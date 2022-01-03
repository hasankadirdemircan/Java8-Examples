package com.hkdemircan.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest04 {
    public static void main(String[] args) {
        Path path1 = Paths.get("../../test/sub/a/b.txt");
        System.out.println(path1.toAbsolutePath());
        System.out.println(path1.toAbsolutePath().normalize());
    }
}
// /Users/hasandemircan/Desktop/Documents/personal-document/Java8-Examples/java-nio2/../../test/sub/a/b.txt
// /Users/hasandemircan/Desktop/Documents/personal-document/test/sub/a/b.txt