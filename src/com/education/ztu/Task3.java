package com.education.ztu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Task3 {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static final String defaultCheckFileName = "directory_for_files/check.txt";

    public static void writeCheckToFile(){
        String check = generateCheck();
        try {
            FileWriter writer = new FileWriter(defaultCheckFileName, StandardCharsets.UTF_8);
            writer.write(check);
            writer.close();
            System.out.println("Звіт з покупки було написано вдало.");
        } catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Звіт з покупки не було написано.");
        }
    }

    public static void readCheckFromFile(){
        try {
            FileReader reader = new FileReader(defaultCheckFileName, StandardCharsets.UTF_8);
            int content;
            while ((content = reader.read()) != -1) {
                System.out.print((char) content);
            }
            reader.close();
            System.out.println("Звіт з покупки було прочитано вдало.");
        } catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Звіт з покупки не було прочитано.");
        }
    }

    public static String generateCheck(){
        Formatter formatter = new Formatter();
        LocalDateTime now = LocalDateTime.now();
        final String border = "=".repeat(48);
        Object[][] products = {
            {"Джинси", "Одяг", 1500.78},
            {"Кроссівки", "Взуття", 5000.56},
            {"Телевізор", "Електроника", 18000.78},
            {"Сковорідка", "Посуд", 1500.90},
            {"Лижі", "Спорт", 22100.78},
            {"Мікрохвильова піч", "Електроника", 10500.78},
            {"Туфлі", "Взуття", 2500.78},
            {"Ліжко", "Меблі", 500.718},
            {"Крісло", "Меблі", 8500.78},
            {"Сукня", "Одяг", 2500.718},
            {"Шкарпетки", "Одяг", 500.718},
            {" М'яч баскетбольний", "Спорт", 1000.78},
        };

        formatter.format("Дата та час покупки:%28s%n", dtf.format(now));
        formatter.format("%s%n", border);
        formatter.format("%-4s%-14s%-19s%-11s%n", "№", "Товар", "Категорія", "Ціна");
        formatter.format("%s%n", border);

        for (int i = 0; i < products.length; i++){
            formatter.format("%-4s%-14s%-19s%-8.2f ₴%n", i + 1 + ".", products[i][0], products[i][1], (double)products[i][2]);
        }

        formatter.format("%s%n", border);
        formatter.format("%-37s%-8.2f ₴%n", "Разом:", getSum(products));

        return formatter.toString();
    }

    static double getSum(Object[][] arr){
        double sum = 0;
        for (Object[] objects : arr) {
            sum += (double) objects[2];
        }
        return sum;
    }
}
