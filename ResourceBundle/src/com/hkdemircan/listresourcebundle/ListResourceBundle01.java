package com.hkdemircan.listresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ListResourceBundle01 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("com.hkdemircan.listresourcebundle.Message", new Locale("en"));
        System.out.println(rb.getString("key1"));
        System.out.println(rb.getString("key2"));
        //
        ResourceBundle rb2 = ResourceBundle.getBundle("com.hkdemircan.listresourcebundle.Message", new Locale("tr"));
        System.out.println(rb2.getString("key1"));
        System.out.println(rb2.getString("key2"));
    }
}
