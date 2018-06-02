package com.liu.buffered_zifu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\file\\demo.txt"));

        String m;
        while ((m = bufferedReader.readLine())!=null) {
            System.out.println(m);
        }

        bufferedReader.close();
    }
}
