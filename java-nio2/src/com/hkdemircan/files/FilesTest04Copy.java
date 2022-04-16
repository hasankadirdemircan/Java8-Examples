package com.hkdemircan.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesTest04Copy {
    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("original/file.txt");

        Path path2 = Paths.get("copied/copied.txt");
        if (!Files.exists(path2)) {
            Files.createDirectories(path2.getParent());
        }

        Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
        // its updated existing file. overwrite

        // REPLACE_EXISTING
        // java.nio.file.FileAlreadyExistsException: copied/copied.txt
    }
}
