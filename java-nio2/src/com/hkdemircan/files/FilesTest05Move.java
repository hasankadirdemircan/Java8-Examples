package com.hkdemircan.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest05Move {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("myfolder");

        if (!Files.exists(p1)) {
            Files.createDirectory(p1);
        }

        Path p2 = Paths.get("renamedFolder");

        Files.move(p1, p2);
    }
}
