package com.liu.io.wirterandreader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符输出流
 * 所有字符输出流的超类
 * 写文件，写文本文件
 *
 * 写的方法writer
 * writer(int c)    一个字符
 * writer(char[] c) 字符数组
 * writer(char[] c,int.int)
 * writer(String c)
 *
 * Writer类的子类FileWriter
 * 构造方法：两个参数File和String
 *
 * 字符输出流写数据的时候，不需要运行flush（）；
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException{
        Writer writer = new FileWriter("src\\file\\demo.txt");

        //一个字符
        writer.write(100);
        writer.flush();

        //写一个字符数组
        char[] c = {'a','b','c','d','e'};
        writer.write(c);
        writer.flush();

        //写一个字符数组一部分
        writer.write(c,2,2);
        writer.flush();

        //写字符串
        writer.write("memecha");
        writer.flush();

        writer.close();
    }
}
