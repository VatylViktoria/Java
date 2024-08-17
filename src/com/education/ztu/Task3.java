package com.education.ztu;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class Task3 {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    public static void doTask(){
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

        System.out.println(formatter);

        Locale[] locales = {
                new Locale("ua", "UA"),
                new Locale("en", "US"),
                new Locale("pl", "PL"),
                Locale.US,
        };
        System.out.println("-----------Task 4-----------");

        for(Locale locale: locales){
            showBundle(products, locale, border);
        }
    }

    static void showBundle(Object[][] products, Locale locale, String border){
        Formatter formatter = new Formatter();

        ResourceBundle resourceBundle = ResourceBundle.getBundle("resources", locale);
        LocalDateTime now = LocalDateTime.now();
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

        formatter.format(resourceBundle.getString("date"), dtf.format(now));
        formatter.format("%s%n", border);
        String[] headers = resourceBundle.getString("headers").split(",");
        formatter.format("%-4s%-14s%-19s%-11s%n", headers[0], headers[1], headers[2], headers[3]);
        formatter.format("%s%n", border);

        for (int i = 0; i < products.length; i++){
            formatter.format("%-4s%-14s%-19s%-8s%n", i + 1 + ".", products[i][0], products[i][1], nf.format(products[i][2]));
        }

        formatter.format("%s%n", border);
        formatter.format("%-37s%-8s%n", resourceBundle.getString("total"), nf.format(getSum(products)));

        System.out.println(formatter);
    }

    static double getSum(Object[][] arr){
        double sum = 0;
        for (Object[] objects : arr) {
            sum += (double) objects[2];
        }
        return sum;
    }
}