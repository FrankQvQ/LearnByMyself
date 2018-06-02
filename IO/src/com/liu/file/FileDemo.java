package com.liu.file;

import java.io.File;

/**
 * 将操作系统中的文件，目录，路径，封装成File对象
 * 提供方法，操作系统中的内容
 * ile与系统无关的类
 * 文件 file
 * 目录 directory
 * 路径 path
 */
public class FileDemo {
    public static void main(String[] args) {
        //File类静态成员变量
        //与系统有关的路径分割符
        String st = File.pathSeparator;
        char c = File.pathSeparatorChar;
        String separator= File.separator;
        System.out.println(st);
        System.out.println(c);
        System.out.println(separator);
    }
}
