package com.education.ztu;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Number 2: ");
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        System.out.println("Sum: " + sum);
    }
}
