package com.hkdemircan.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest02 {
    //CREATE DIRECTORY - DIRECTORIES
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("folder");

        if (!Files.exists(path1)) {
            Files.createDirectory(path1);
        }

        Path path2 = Paths.get("dir1/dir2");

        if (!Files.exists(path2)) {
            //Files.createDirectory(path2); //if there isn't parent folder, we get an error.! dir1
            Files.createDirectories(path2);
        }
    }
}
