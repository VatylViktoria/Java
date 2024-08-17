package com.education.ztu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        Product product1 = new Product("Продукт 1", 11.1 );
        Product product2 = new Product("Продукт 2", 13.3 );
        Product product3 = new Product("Продукт 3", 15.5 );
        Product product4 = new Product("Продукт 4", 17.7 );
        List<Product> products1 = Arrays.asList(product1, product3, product2);
        List<Product> products2 = Arrays.asList(product1, product3, product2);

        System.out.println("asList(product1, product3, product2): " + products1);
        Collections.sort(products1);
        System.out.println("sort(products1): " + products1);
        System.out.println("binarySearch(products1, product1): " + Collections.binarySearch(products1, product2));
        Collections.reverse(products1);
        System.out.println("reverse(products1): " + products1);
        Collections.shuffle(products1);
        System.out.println("shuffle(products1): " + products1);
        Collections.fill(products2, product4);
        System.out.println("fill(products2, product4): " + products2);
        System.out.println("max(products1): " + Collections.max(products1));
        System.out.println("min(products1): " + Collections.min(products1));
        Collections.copy(products2, products1 );
        System.out.println("copy(products2, products1): " + products2);
        Collections.rotate(products1, 1);
        System.out.println("rotate(products1, 1): " + products1);
        Collection<Product> products3  = Collections.checkedCollection(products1, Product.class);
        System.out.println("checkedCollection(products1, Product.class): " + products3);
        System.out.println("frequency(products1, product2): " + Collections.frequency(products1, product2));
    }
}
