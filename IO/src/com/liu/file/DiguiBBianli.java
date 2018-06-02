package com.liu.file;

import java.io.File;

/**
 * D:\Main\Relaxation\Longest movie
 * 用递归遍历这个目录里面的所有文件
 */
public class DiguiBBianli {
    public static void main(String[] args) {
        File file = new File("D:\\Main\\Relaxation\\Longest movie");
        funckion(file);
    }

    private static void funckion(File file) {
        File[] files = file.listFiles((x)->{return true;});
        for (File demo : files) {
            if (demo.isDirectory()) funckion(demo);
            System.out.println(demo);
        }
    }
}
