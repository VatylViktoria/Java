package com.education.ztu;

public class Task2 {
    public static void doTask(){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        str1.append(4).append(" + ").append(36).append(" = ").append(40);
        System.out.println(str1);
        str2.append(4).append(" - ").append(36).append(" = ").append(-32);
        System.out.println(str2);
        str3.append(4).append(" * ").append(36).append(" = ").append(144);
        System.out.println(str3);

        int equalsIndex = str1.indexOf("=");

        str1.deleteCharAt(equalsIndex);
        str1.insert(equalsIndex, "рівно");
        System.out.println(str1);

        str2.replace(equalsIndex, equalsIndex + 1, "рівно");
        System.out.println(str2);

        str3.reverse();
        System.out.println(str3);
        System.out.println("Length: " + str3.length());
        System.out.println("Capacity: " + str3.capacity());
    }
}