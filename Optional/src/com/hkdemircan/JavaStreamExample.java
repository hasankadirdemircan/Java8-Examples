package com.hkdemircan;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"Kadir",25000f));
        productsList.add(new Product(2,"Kadir",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        final boolean a = false;

        productsList.stream()
                .filter(e -> a && e.id == 1 )
                .map(pm ->pm.price)
                .forEach(System.out::println);
       /* productsList.stream()
                .filter(p ->p.price> 30000)   // filtering price
                .map(pm ->pm.price)          // fetching price
                .forEach(System.out::println);  // iterating price

        */
    }
}
