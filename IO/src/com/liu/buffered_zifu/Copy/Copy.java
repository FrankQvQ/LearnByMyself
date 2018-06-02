package com.liu.buffered_zifu.Copy;

import java.io.*;

/**
 * 读取文本行，读一行，写一行，写换行
 */
public class Copy {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("src\\file\\demo.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\fileCopy\\democopy.txt"));

        String en;
        while ((en = br.readLine())!=null) {
            bw.write(en);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
