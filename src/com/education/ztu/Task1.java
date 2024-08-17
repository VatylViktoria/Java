package com.education.ztu;

import java.util.Locale;

public class Task1 {
    public static void doTask(String string){
        System.out.println("Last char: " + string.charAt(string.length() - 1));
        System.out.println("Ends with !!!: " + string.endsWith("!!!"));
        System.out.println("Starts with 'I learn': " + string.startsWith("I learn"));
        System.out.println("Contains 'Java': " + string.contains("Java"));
        System.out.println("'Java' position: " + string.indexOf("Java"));
        System.out.println("'a' replaced with 'o': " + string.replaceAll("a", "o"));
        System.out.println("Uppercase: " + string.toUpperCase(Locale.ROOT));
        System.out.println("Lowercase: " + string.toLowerCase(Locale.ROOT));
        System.out.println("Cut 'Java': " + string.replace("Java", ""));
    }
}