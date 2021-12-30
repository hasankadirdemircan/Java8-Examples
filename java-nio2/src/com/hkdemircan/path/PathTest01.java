package com.hkdemircan.path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

    public static void main(String[] args) {
        Path path1 = Paths.get("/folder1/folder2");
        System.out.println(path1.getClass());

        // class sun.nio.fs.UnixPath (linux , macos )
        System.out.println(path1);

        File file = new File("/folder1/folder2");

    }
}
