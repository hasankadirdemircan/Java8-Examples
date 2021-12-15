package com.hkdemircan.trywithresource;

import java.util.Scanner;

public class TryWithResource02 {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
            //s.close(); don't need it
        }

        try (Scanner s2 = new Scanner(System.in)) {
            s2.nextLine();
        } catch (Exception e) {
            //s2.nextInt(); // DOES NOT COMPILE
        } finally {
            //s2.nextInt(); // DOES NOT COMPILE
        }
        //The problem is that Scanner has gone out of scope at the end of the try clause
    }
}
