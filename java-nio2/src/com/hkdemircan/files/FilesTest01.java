package com.hkdemircan.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest01 {
    //CREATE FILE
    public static void main(String[] args) throws IOException {
        //came from Java7 - Files
        Path path1 = Paths.get("test.txt");

        if (!Files.exists(path1)) {
            Files.createFile(path1);
            // java.nio.file.FileAlreadyExistsException:
        }

        Path path2 = Paths.get("src/files/myFile.txt");

        System.out.println(Files.exists(path1));
        System.out.println(Files.exists(path2));

//		if (!Files.exists(path2)) {
//			Files.createFile(path2);
//		}
    }
}
