package com.hkdemircan.trywithresource;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource01 {
    public static void main(String[] args) {
        //Before Java7
        FileWriter fw = null;
        try {
            fw = new FileWriter("file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
            }
        }

        //After Java7
        //try with resource
        try (FileWriter fw2 = new FileWriter("file2.txt");
             FileWriter fw3 = new FileWriter("file2.txt")) {

            fw2.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
