package com.education.ztu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task6 {
    public static void processTask(){
        String path = "directory_for_files/inner_directory";
        File innerDirectory = new File(path);
        innerDirectory.mkdirs();
        System.out.println(innerDirectory.getAbsolutePath());
        System.out.println(innerDirectory.getParent());
        try{
            Files.createFile(Path.of(innerDirectory.getAbsolutePath() + "/file1.txt"));
            Files.createFile(Path.of(innerDirectory.getAbsolutePath() + "/file2.txt"));
            Files.delete(Path.of(innerDirectory.getAbsolutePath() + "/file2.txt"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
        innerDirectory.renameTo(new File("directory_for_files/renamed_inner_directory"));
        File mainDirectory = innerDirectory.getParentFile();
        File[] files = mainDirectory.listFiles();
        for(File file: files){
            try{
                System.out.printf(
                        "Name: %s, size: %d bytes, type: %s%n",
                        file.getName(),
                        (int)Files.size(file.toPath()),
                        file.isDirectory() ? "Directory" : "File"
                );
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
