package com.education.ztu;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, Product> products1 = new HashMap<>();
        Product product1 = new Product("Продукт 1", 11.1 );
        Product product2 = new Product("Продукт 2", 13.3 );
        Product product3 = new Product("Продукт 3", 15.5 );
        products1.put(product1.name, product1);
        products1.put(product2.name, product2);
        Map<String, Product> products2 = new HashMap<>();
        products2.put(product1.name, product1);
        products2.put(product2.name, product2);

        System.out.println("get(product1.name): " + products1.get(product1.name));
        System.out.println("containsKey(product3.name): " + products1.containsKey(product3.name));
        System.out.println("containsValue(product3): " + products1.containsValue(product3));
        products1.clear();
        System.out.println("clear(): " + products1);
        products1.putIfAbsent(product3.name, product3);
        System.out.println("putIfAbsent(): " + products1);
        System.out.println("keySet(): " + products1.keySet());
        System.out.println("values(): " + products1.values());
        products1.putAll(products2);
        System.out.println("putAll(): " + products1);
        products1.remove(product1.name);
        System.out.println("remove(): " + products1);
        System.out.println("size(): " + products1.size());
    }
}
