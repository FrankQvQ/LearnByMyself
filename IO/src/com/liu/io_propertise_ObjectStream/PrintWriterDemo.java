package com.liu.io_propertise_ObjectStream;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) throws Exception{
        function_3();
    }

    /**
     * 打印流，可以开启自动刷新功能
     * 满足两个条件
     *      1.数据目的必须是流对象
     *      2.必须调用println,printf,format三个方法中的一个，启动自动更新
     */
    private static void function_3()throws IOException{
        FileOutputStream fos = new FileOutputStream(new File("src\\file\\demo.txt"));
        PrintWriter pw = new PrintWriter(fos,true);
        pw.println("a");
        pw.println("a");
        pw.println("a");
        pw.println("a");
        pw.close();
    }
    /**
     * 打印流，输出目的是流对象
     * 字节流和字符流都行
     */
    private static void function_2()throws IOException{
        FileOutputStream fos = new FileOutputStream(new File("src\\file\\demo.txt"));
        FileWriter fw = new FileWriter(new File("src\\file\\demo.txt"));
        PrintWriter pw = new PrintWriter(fw);
        pw.println("memcha");
        pw.close();
    }
    /**
     * 打印流，输入目的，String文件名
     */
    private static void function_1()throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("src\\file\\demo.txt");
        pw.println(3.5);
        pw.close();
    }
    /**
     *打印流，向file对象的数据目的写入数据
     * 方法print println 原样输出
     * write走编码表
     */
    private static void function() throws FileNotFoundException {
        File file = new File("src\\file\\demo.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(100);
        pw.flush();
        pw.close();
    }
}
