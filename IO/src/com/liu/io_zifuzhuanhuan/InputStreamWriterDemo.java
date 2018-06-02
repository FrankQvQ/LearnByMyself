package com.liu.io_zifuzhuanhuan;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 继承Reader
 * 字符输入流，读取文本文件
 * <p>
 * 是字节流流向字符的桥梁，将字节流转换为字符流
 * 读取的方法：
 * read() 读取一个字符，读取字符数组
 * <p>
 * 技巧：OutputStreamWriter写了文件
 * InputStreamWriter读取文件
 * <p>
 * InputStreamWriter(InputStream) 接受所有的字节输入流
 * InputStreamWriter(InputStream， String charsetName))
 */
public class InputStreamWriterDemo {
    public static void main(String[] args) throws Exception{
        readUTF();
    }

    /**
     * 转换流，InputStreamReader读取文本
     */
    public static void readUTF() throws Exception {
        InputStream fis = new FileInputStream("src\\file\\demo.txt");

        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        int len = 0;
        char[] chars = new char[1024];
        while ((len = isr.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
    }

    public static void readGBK() throws Exception {
        InputStream fis = new FileInputStream("src\\file\\demo.txt");

        InputStreamReader isr = new InputStreamReader(fis,"GBK");
        int len = 0;
        char[] chars = new char[1024];
        while ((len = isr.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
    }

}
