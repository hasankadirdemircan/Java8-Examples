package com.hkdemircan.multicatch;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatch01 {

    public static void main(String[] args) {
        //Before Java7
        try {
            testMethod();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //After Java7
        try {
            testMethod();
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public static void testMethod() throws FileNotFoundException, SQLException {


    }
}
