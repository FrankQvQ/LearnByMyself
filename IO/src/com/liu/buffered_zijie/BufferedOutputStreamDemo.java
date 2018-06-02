package com.liu.buffered_zijie;

import java.io.*;
/**
 * 提高原有输出流的写入效率
 * 继承OutputStream
 * 传递任意的字节输出流，传递的是那个字节流，就对那个字节流提高速率
 */
public class BufferedOutputStreamDemo {

    public static void main(String[] args) throws IOException{
        BufferedOutputStream bos = new
                BufferedOutputStream(new FileOutputStream("src\\file\\demo.txt"));
        bos.write(55);
        byte[] b = "asjhdsad".getBytes();
        bos.write(b);
        bos.close();
    }
}
