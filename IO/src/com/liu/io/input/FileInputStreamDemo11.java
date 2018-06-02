package com.liu.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo11 {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = new FileInputStream(new File("src\\file\\demo.txt"));
        //创建字节数组
        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len = inputStream.read(bytes)) != -1){
//            if (len == 1) System.out.println(new String(bytes,0,1));
//            System.out.print(new String(bytes));
            System.out.print(new String(bytes,0,len));
        }
        inputStream.close();
    }
}
//                len = inputStream.read(bytes);
//                System.out.println(new String(bytes));
//                System.out.println(len);
//
//                len = inputStream.read(bytes);
//                System.out.println(new String(bytes));
//                System.out.println(len);
//
//                len = inputStream.read(bytes);
//                System.out.println(new String(bytes));
//                System.out.println(len);
//
//                len = inputStream.read(bytes);
//                System.out.println(new String(bytes));
//                System.out.println(len);
//
//                len = inputStream.read(bytes);
//                System.out.println(new String(bytes));
//                System.out.println(len);