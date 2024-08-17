package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Завдання 2---------");
        System.out.println(Task2.checkCredentials("qwerty", "qwerty", "qwerty"));
        System.out.println(Task2.checkCredentials("qwe-rty", "qwe0rty", "qwerty"));
        System.out.println("---------Завдання 3---------");
        Task3.writeCheckToFile();
        Task3.readCheckFromFile();
        System.out.println("---------Завдання 4---------");
        Task4.copyFile("img.jpg");
        Task4.copyFile("check.txt");
        System.out.println("---------Завдання 5---------");
        Task5.randomChangeToFile("directory_for_files/copy_check.txt");
        System.out.println("---------Завдання 6---------");
        Task6.processTask();
        System.out.println("---------Завдання 7---------");
        Task7.writeToZip();
        Task7.readFromZip();
    }
}
