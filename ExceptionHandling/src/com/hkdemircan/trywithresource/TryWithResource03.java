package com.hkdemircan.trywithresource;

import java.io.IOException;

public class TryWithResource03 {
    public static void main(String[] args) {

        try (Computer computer = new Computer()) {

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

class Computer implements AutoCloseable {

    @Override
    public void close() throws IOException{
        // for override methods , we can't add a new checked exception.
        // we can add an exception which is IS-A.
    }
}