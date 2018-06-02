package com.liu.io.wirterandreader.copy;

import java.io.*;

/**
 * 字符流复制文本文件，必须文本文件
 * 字符流查询本机默认的编码表，简体中文GBK
 */
public class Copy {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("src\\file\\demo.txt");
            fw = new FileWriter("src\\fileCopy\\democopy.txt");
            char[] cbuf = new char[1024];
//            boolean var4 = false;

            int len;
            while((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
                fw.flush();
            }
        } catch (IOException var39) {
            System.out.println(var39);
            throw new RuntimeException("复制失败");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException var37) {
                throw new RuntimeException("释放资源失败");
            } finally {
                try {
                    if (fr != null) {
                        fr.close();
                    }
                } catch (IOException var36) {
                    throw new RuntimeException("释放资源失败");
                }

            }

        }
    }
}
