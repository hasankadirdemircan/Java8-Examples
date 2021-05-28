package com.hkdemircan;

import java.util.function.Supplier;

public class SupplierTest01 {
    // Supplier<T>
    // method:     T get();
    public static void main(String[] args) {

        Supplier<String> supplier01 = () -> "Supplier Example";
        System.out.println(supplier01.get());
    }
}
/**
 * Outputs:
 * Supplier Example
 */