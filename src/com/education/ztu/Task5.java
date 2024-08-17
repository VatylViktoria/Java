package com.education.ztu;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Task5 {
    public static void randomChangeToFile(String filename){
        try (RandomAccessFile raf = new RandomAccessFile(filename, "rw")){
            raf.seek(204);
            raf.write("Test".getBytes());
            raf.seek(898);
            raf.write("Test".getBytes());
            raf.seek(919);
            raf.write("Test".getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.printf("Файл %s не було змінено вдало.%n", filename);
            return;
        }
        System.out.printf("Файл %s було змінено.%n", filename);
    }
}
