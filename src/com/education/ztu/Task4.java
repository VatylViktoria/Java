package com.education.ztu;

import java.util.ArrayDeque;

public class Task4 {
    public static void main(String[] args) {
        ArrayDeque<Product> products1 = new ArrayDeque<>();
        Product product1 = new Product("Продукт 1", 11.1 );
        Product product2 = new Product("Продукт 2", 13.3 );
        Product product3 = new Product("Продукт 3", 15.5 );
        products1.push(product1);
        products1.push(product2);
        System.out.println("push(): " + products1);
        products1.offerLast(product3);
        System.out.println("offerLast(): " + products1);
        System.out.println("getFirst(): " + products1.getFirst());
        System.out.println("peekLast(): " + products1.peekLast());
        System.out.println("pop(): " + products1.pop());
        System.out.println("removeLast(): " + products1.removeLast());
        System.out.println("pollLast (): " + products1.pollLast());
    }
}
