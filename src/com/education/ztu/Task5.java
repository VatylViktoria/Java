package com.education.ztu;

import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {
        TreeSet<Product> products1 = new TreeSet<>();
        Product product1 = new Product("Продукт 1", 11.1 );
        Product product2 = new Product("Продукт 2", 13.3 );
        Product product3 = new Product("Продукт 3", 15.5 );
        products1.add(product1);
        products1.add(product2);
        System.out.println("add(): " + products1);
        System.out.println("first(): " + products1.first());
        System.out.println("last(): " + products1.last());
        System.out.println("headSet(): " + products1.headSet(product2));
        products1.add(product2);
        products1.add(product3);
        System.out.println("subSet(product1, product2): " + products1.subSet(product1, product3));
        System.out.println("tailSet(product2, true): " + products1.tailSet(product2, true));
        System.out.println("ceiling(product1): " + products1.ceiling(product1));
        System.out.println("floor(product1): " + products1.floor(product1));
        System.out.println("higher(product2): " + products1.higher(product2));
        System.out.println("lower(product2): " + products1.lower(product2));
        System.out.println("pollFirst(): " + products1.pollFirst());
        System.out.println("pollLast(): " + products1.pollLast());
        products1.add(product3);
        System.out.println("descendingSet(): " + products1.descendingSet());
    }
}
