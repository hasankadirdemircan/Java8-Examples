package com.hkdemircan;

import java.util.function.Function;

public class FunctionTest04 {

    public static void main(String[] args) {
        Function<String, Integer> f1 = Utility::calculateLengthOfTemp;
        System.out.println(f1.apply("hkdemircan"));

        //
        Function<String, Integer> f2 = String::length;
        System.out.println(f2.apply("hkdemircan"));
    }
}

class Utility{

    public static int calculateLengthOfTemp(String str){
        return str.length();
    }
}
/**Outputs:
 10
 10
 */
