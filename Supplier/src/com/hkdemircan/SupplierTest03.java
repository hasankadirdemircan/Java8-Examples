package com.hkdemircan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierTest03 {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // public static LocalDateTime now()
    public static void main(String[] args) {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());

        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        LocalDateTime localDateTime = supplier02.get();
        System.out.println(localDateTime);

        Supplier<String> supplier03 = () -> dtf.format(LocalDateTime.now());
        String localDateTimeFormatter = supplier03.get();

        System.out.println(localDateTimeFormatter);
    }

}
/**
 2020-12-25T23:35:23.952
 2020-12-25T23:35:23.953
 2020-12-25
 */

