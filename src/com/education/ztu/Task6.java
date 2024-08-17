package com.education.ztu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int n = sc.nextInt();

        int[] fibonacciArr = getFibonacci(n);
        String[] fibonacciStringValues = intArrayToStringArray(fibonacciArr);
        System.out.println("Fibonacci: " + String.join(",", fibonacciStringValues));

        String[] fibonacciArrCopy = Arrays.copyOf(fibonacciStringValues, fibonacciArr.length);
        Collections.reverse(Arrays.asList(fibonacciArrCopy));
        System.out.println("Fibonacci reverse: " + String.join(",", fibonacciArrCopy));
    }

    public static int[] getFibonacci(int length){
        int[] arr = new int[length];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static String[] intArrayToStringArray(int[] arr) {
        String[] newArr = new String[arr.length];
        for (int i = 0; i < newArr.length; i++)
            newArr[i] = String.valueOf(arr[i]);
        return newArr;
    }
}
