package com.hkdemircan.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest03CompareFiles {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("folder");
        Path path2 = path1.toAbsolutePath();

        System.out.println(path1);
        System.out.println(path2);

        System.out.println(Files.isSameFile(path1, path2));
        //

        Path path3 = Paths.get("test.txt");
        Path path4 = Paths.get("test2.txt");
        System.out.println(Files.isSameFile(path3, path4));
        // doesn't look at content!
    }
}
