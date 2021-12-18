package com.hkdemircan.propertyresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertyResourceBundle01 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("messages",new Locale("tr"));
        ResourceBundle rb2 = ResourceBundle.getBundle("messages",new Locale("en"));

        System.out.println(rb.getString("message.subject"));
        System.out.println(rb2.getString("message.subject"));

        ResourceBundle rb3 = ResourceBundle.getBundle("com.hkdemircan.propertyresourcebundle.file",new Locale("en"));
        System.out.println(rb3.getString("test.subject"));

         System.out.println(rb.getString("test.subject"));
        // java looks under src/resources file. That's why
        // Can't find resource for bundle java.util.PropertyResourceBundle, key test.subject
        // If you use another path,

    }
}
