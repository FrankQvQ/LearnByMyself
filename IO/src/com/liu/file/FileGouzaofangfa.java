package com.liu.file;

import java.io.File;

/**
 * File类的构造方法
 * 三种重载
 */
public class FileGouzaofangfa {
    public static void main(String[] args) {
        function1();
    }
    public static void function() {
        File file = new File("D:\\Main\\Learn app\\MYSQL\\mysql-5.7.19-winx64");
        System.out.println(file);
    }
    public static void function1() {
        File file = new File("D:\\Main\\Learn app\\MYSQL","mysql-5.7.19-winx64");
        System.out.println(file);
    }
}
