package com.liu.buffered_zifu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\file\\demo.txt"));

        writer.write("你好");
        writer.newLine();
        writer.flush();

        writer.write("你好".toCharArray());
        writer.flush();

        writer.write("么么插");
        writer.flush();

        writer.close();
    }
}
