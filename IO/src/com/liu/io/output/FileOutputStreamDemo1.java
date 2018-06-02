package com.liu.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException{
        File file = new File("src\\file\\demo.txt");
        System.out.println(file.exists());

        OutputStream outputStream = new FileOutputStream(file,true);
        outputStream.write("emmecha".getBytes());
        outputStream.close();
    }
}
