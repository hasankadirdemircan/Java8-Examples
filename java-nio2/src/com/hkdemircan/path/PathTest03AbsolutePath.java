package com.hkdemircan.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03AbsolutePath {
    public static void main(String[] args) {
        Path path = Paths.get("folder", "folder2", "kadirdirector");
        System.out.println(path);
        System.out.println(path.isAbsolute());
        System.out.println(path.toAbsolutePath());
    }
}
