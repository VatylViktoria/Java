package com.education.ztu;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Number 2: ");
        int number2 = sc.nextInt();
        System.out.println("Greatest common divisor: " + getGreatestCommonDivisor(number1, number2));
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        int gcd = 1;
        for (int i = 1; i <= number1 && i <= number2; i++)
            if (number1 % i == 0 && number2 % i == 0)
                gcd = i;
        return gcd;
    }
}
