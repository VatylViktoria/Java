package com.education.ztu;

import java.util.Arrays;

public class Product implements Comparable<Product> {
    public String name;
    public double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Продукт(name=\"%s\", ціна=%.2f)", name, price);
    }

    @Override
    public int compareTo(Product product) {
        return name.compareTo(product.name);
    }

    public static String arrayToString(Object[] products){
        String stringProducts = String.join(",", Arrays.stream(products).map(Object::toString).toArray(String[]::new));
        return String.format("[%s]", stringProducts);
    }
}
