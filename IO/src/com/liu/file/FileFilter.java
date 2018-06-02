package com.liu.file;

import java.io.File;

public class FileFilter {
    public static void main(String[] args) {
        File file = new File("src");
        File[] files = file.listFiles((x) -> {
            return x.getName().endsWith(".java");
        });
        for (File c : files) {
            System.out.println(c);
        }
    }

}
