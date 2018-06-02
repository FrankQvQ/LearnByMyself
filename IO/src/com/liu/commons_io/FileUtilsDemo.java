package com.liu.commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 readFileToString(File file)：读取文件内容，并返回一个String；
 writeStringToFile(File file，String content)：将内容content写入到file中；
 copyDirectoryToDirectory(File srcDir,File destDir);文件夹复制
 copyFile(File srcFile,File destFile);文件夹复制
 */
public class FileUtilsDemo {
    public static void main(String[] args) throws Exception{
//        readFileToStringdemo();
//        writeStringToFiledemo();
        copyFiledemo();
    }

    public static void copyFiledemo() throws Exception{
        FileUtils.copyFile(new File("src\\file\\demo.txt"),new File("src\\fileCopy\\FileUtils.txt"));
    }

    public static void copyDirectoryToDirectory() throws Exception{
        FileUtils.copyDirectoryToDirectory(new File("目录1"),new File("目录2"));
    }

    public static void writeStringToFiledemo() throws Exception{
        FileUtils.writeStringToFile(new File("src\\file\\demo.txt"),"我爱一条柴");
    }

    public static void readFileToStringdemo() throws Exception{
        String s = FileUtils.readFileToString(new File("src\\file\\demo.txt"));
        System.out.println(s);
    }
}
