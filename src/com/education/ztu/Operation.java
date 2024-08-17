package com.education.ztu;

import java.util.Arrays;

public class Operation {
    public static int addition(int... args){
        return Arrays.stream(args).sum();
    }

    public static int subtraction(int... args){
        return Arrays.stream(args).reduce((a, b) -> a - b).getAsInt();
    }

    public static int multiplication(int... args){
        return Arrays.stream(args).reduce((a, b) -> a * b).getAsInt();
    }

    public static int division(int... args){
        return Arrays.stream(args).reduce((a, b) -> a / b).getAsInt();
    }

    public static double average(int... args){
        return Arrays.stream(args).average().getAsDouble();
    }

    public static int max(int... args){
        return Arrays.stream(args).max().getAsInt();
    }

    public static int min(int... args){
        return Arrays.stream(args).min().getAsInt();
    }

    public static double addition(double... args){
        return Arrays.stream(args).sum();
    }

    public static double subtraction(double... args){
        return Arrays.stream(args).reduce((a, b) -> a - b).getAsDouble();
    }

    public static double multiplication(double... args){
        return Arrays.stream(args).reduce((a, b) -> a * b).getAsDouble();
    }

    public static double division(double... args){
        return Arrays.stream(args).reduce((a, b) -> a / b).getAsDouble();
    }

    public static double average(double... args){
        return Arrays.stream(args).average().getAsDouble();
    }

    public static double max(double... args){
        return Arrays.stream(args).max().getAsDouble();
    }

    public static double min(double... args){
        return Arrays.stream(args).min().getAsDouble();
    }
}
