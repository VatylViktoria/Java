package com.education.ztu;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args){
        System.out.printf("Location values: %s%n", Arrays.toString(Location.values()));

        System.out.printf("Addition: %s%n", Operation.addition(1, 2, 3, 4, 5, 6));
        System.out.printf("Subtraction: %s%n", Operation.subtraction(1, -2, 3, 4, 5, -6));
        System.out.printf("Multiplication: %s%n", Operation.multiplication(1, 2, 3, 4, 5, 6));
        System.out.printf("Division: %s%n", Operation.division(1.3, 2.1, 3.6, 4.7, 5.2, 6.2));
        System.out.printf("Average: %s%n", Operation.average(1, 2, 3, 4, 5, 6));
        System.out.printf("Maximum: %s%n", Operation.max(1, 2, 3, 4, 5, 6));
        System.out.printf("Minimum: %s%n", Operation.min(1, 2, 3, 4, 5, 6));
    }
}
