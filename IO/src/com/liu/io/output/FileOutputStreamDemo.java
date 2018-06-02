package com.liu.io.output;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;

/**
 * 写入数据文件，学习父类方法，使用子类对象
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        File file = new File("src\\file\\demo.txt");
//        file.createNewFile();
        OutputStream outputStream = new FileOutputStream(file);
        //流对象写入数据
        //写一个字节
        outputStream.write(100);

        //写字节数组
        byte[] bytes = {65,66,67,68};
        outputStream.write(bytes);

        //写字符串的简单方法
        outputStream.write("woainimemecha".getBytes());

        outputStream.close();
    }
}
