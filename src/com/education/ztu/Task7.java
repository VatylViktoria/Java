package com.education.ztu;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Task7 {
    static List<String> filesListInDir = new ArrayList<>();
    static final String archiveName = "directory_for_files/files.zip";
    public static void writeToZip(){
        try (FileOutputStream fos = new FileOutputStream(archiveName);
             ZipOutputStream zos = new ZipOutputStream(fos)){
            populateFilesList(new File("directory_for_files"));
            for (String path: filesListInDir){
                ZipEntry entry = new ZipEntry(path);
                zos.putNextEntry(entry);
                zos.write(Files.readAllBytes(Path.of(path)));
                zos.closeEntry();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
        filesListInDir.clear();
        System.out.printf("Архів %s було створено.%n", archiveName);
    }

    public static void readFromZip(){
        try (FileInputStream fis = new FileInputStream(archiveName);
             ZipInputStream zis = new ZipInputStream(fis)) {
            ZipEntry entry;
            System.out.println("Файли з zip:");
            while ((entry = zis.getNextEntry()) != null) {
                System.out.printf("Назва: %s, тип: %s%n", entry.getName(), entry.isDirectory() ? "Directory" : "File");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void populateFilesList(File dir) throws IOException {
        File[] files = dir.listFiles();
        for(File file : files){
            if(file.isFile()){
                if(!Files.isSameFile(Path.of(file.getPath()), Path.of(archiveName)))
                    filesListInDir.add(file.getPath());
            }
            else populateFilesList(file);
        }
    }
}
