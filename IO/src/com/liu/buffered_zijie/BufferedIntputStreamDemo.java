package com.liu.buffered_zijie;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedIntputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new
                BufferedInputStream(new FileInputStream("src\\file\\demo.txt"));

        int len;
        byte[] en = new byte[1024];
        while ((len = bis.read(en)) != -1) {
            System.out.println(new String(en, 0, len));
        }
        bis.close();
    }
}
