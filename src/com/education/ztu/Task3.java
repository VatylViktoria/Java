package com.education.ztu;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Product> products1 = new ArrayList<>();
        Product product1 = new Product("Продукт 1", 12.2);
        products1.add(product1);
        System.out.println(products1);
        ArrayList<Product> products2 = new ArrayList<>();
        products1.add(new Product("Продукт 2", 2.2));
        products1.add(new Product("Продукт 3", 12.24));
        products1.addAll(products2);
        System.out.println(products1);

        System.out.println("get(0): " + products1.get(0));
        System.out.println("indexOf(product1): " + products1.indexOf(product1));
        System.out.println("lastIndexOf(product1): " + products1.lastIndexOf(product1));
        Iterator<Product> iterator = products1.iterator();
        System.out.println("iterator():");
        while (iterator.hasNext())
            System.out.println(iterator.next());
        products1.remove(product1);
        System.out.println("remove(product1): " + products1);
        System.out.println("set(0, product1): " + products1.set(0, product1));
        products1.sort(Comparator.comparing(p -> p.name));
        System.out.println("sort(): " + products1);
        System.out.println("subList(): " + products1.subList(0, 1));
        products2.clear();
        System.out.println("clear(): " + products2);
        System.out.println("contains(product1): " + products1.contains(product1));
        System.out.println("isEmpty(): " + products2.isEmpty());
        System.out.println("retainAll(products1): " + products2.retainAll(products1));
        System.out.println("size(): " + products1.size());
        System.out.println("toArray(): " + Product.arrayToString(products1.toArray()));
    }

}
