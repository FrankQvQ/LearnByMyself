package com.liu.io_propertise_ObjectStream;

import java.io.*;

/**
 * 打印流实现文本复制
 *      读取数据源BufferedReader+File 读取文本行
 *      写入数据目的PrintWriter+println 自动刷新
 */
public class PrintWriterDemoCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\file\\demo.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("src\\fileCopy\\democopy.txt"),true);

        String line = null;
        while ((line = br.readLine())!=null) {
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}
