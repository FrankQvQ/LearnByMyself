package com.liu.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException{
        InputStream inputStream = new FileInputStream(new File("src\\file\\demo.txt"));
        int len;
        //读取一个字节
        while ((len=inputStream.read()) != -1) {
            System.out.print((char)len);
        }
        inputStream.close();
    }
}
