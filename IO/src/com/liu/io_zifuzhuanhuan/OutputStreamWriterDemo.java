package com.liu.io_zifuzhuanhuan;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 继承Writer类
 * 就是一个字符输出流，写文本文件
 * write()字符，字符数组，字符串
 *
 * 字符流通向字节流的桥梁，可以将字符流转换为字节流
 * OutputStreamWriter使用方式
 * 构造方法:
 *  OutputStreamWriter(OutputStream out)接受所有的字节输出流
 *  OutputStreamWriter(OutputStream out, String charsetName) 接受所有的字节输出流，编码表的名字
 *  能写的名字GBK,UTF-8 不区分大小写
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception{
        writerUTF();
    }
    /**
     * 转换流对象写文本
     * 要求GBK形式
     */
    public static void writerUTF() throws Exception {
        FileOutputStream fos = new FileOutputStream("src\\file\\demo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        osw.write("你好");
        osw.flush();

        osw.close();
    }

    public static void writerGBK() throws Exception{
        //创建字节输出流，绑定数据文件
        FileOutputStream fos = new FileOutputStream("src\\file\\demo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        osw.write("你好");
        osw.flush();

        osw.close();
    }
}
