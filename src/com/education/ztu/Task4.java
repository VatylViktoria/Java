package com.education.ztu;

import java.io.*;
import java.util.function.Function;

public class Task4 {
    public static void copyFile(String filename){
        String directoryFileName = getDirectoryFileName(filename);
        File file = new File(directoryFileName);
        final Function<File, Boolean> copier;

        if (getExtension(file).equals(".txt"))
            copier = Task4::copyTextFile;
        else
            copier = Task4::copyImageFile;

        if (!copier.apply(file)){
            System.out.printf("Файл %s було скопійовано.%n", filename);
            return;
        }
        System.out.printf("Файл %s було скопійовано.%n", filename);
    }

    private static boolean copyImageFile(File inputFile){
        File outputFile = new File(getFullCopyFileName(inputFile));
        try (InputStream inputStream = new FileInputStream(inputFile);
             OutputStream outputStream = new FileOutputStream(outputFile)){
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static boolean copyTextFile(File file){
        try (FileReader reader = new FileReader(file.getAbsolutePath());
             FileWriter writer = new FileWriter(getFullCopyFileName(file))){
            int content;
            while ((content = reader.read()) != -1) {
                writer.write((char) content);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static String getDirectoryFileName(String filename){
        return "directory_for_files/" + filename;
    }

    private static String getFullCopyFileName(File file){
        String copyName = "copy_" + file.getName();
        return file.getParentFile().getAbsolutePath() + "/" + copyName;
//        return file.getAbsolutePath().replaceFirst(file.getName(), copyName);
    }

    private static String getExtension(File file){
        return file.getName().substring(file.getName().lastIndexOf("."));
    }
}
