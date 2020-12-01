package com.java.automation.lab.fall.kapinus.core22.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileUtil {

    public static String read(String path) {

        StringBuffer result = new StringBuffer();
        try {
            Files.readAllLines(Path.of((path))).forEach(result::append);
        } catch(IOException ex){
            ex.printStackTrace();
        }
        return result.toString();
    }

    public static void overwrite (String content, String path){
        write(content, path, false);
    }

    public static void append (String content, String path){
        write(content, path, true);
    }

    private static void write(String content, String path, boolean append){
        try {
            if (append){
                Files.writeString(Path.of(path), content, StandardOpenOption.APPEND);
            } else {
                Files.writeString(Path.of(path), content);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
}