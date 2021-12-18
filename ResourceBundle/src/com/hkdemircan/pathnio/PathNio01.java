package com.hkdemircan.pathnio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNio01 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        // as we know \
        // here, creates only a File object , this code doesn't create a test.txt on storage.
        // doesn't create a File !

        // same behavior for Path.
        // came from Java7
        Path path = Paths.get("test.txt");
        //
        System.out.println(path.getFileName());
        System.out.println(path.toAbsolutePath().toString());

        // class sun.nio.fs.UnixPath
        System.out.println(path.getClass());
    }
}
