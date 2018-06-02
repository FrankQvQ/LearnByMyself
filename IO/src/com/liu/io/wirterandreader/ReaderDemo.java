package com.liu.io.wirterandreader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**什么叫文本文件，用记事本打开能看懂就叫文本文件
 * 字符输入流读取文本文件。
 * 可以读中文。
 *
 * java.io.Reader,所有字符输入类的超类
 *
 * 读取的方法：read()
 * int read(int c)    一个字符
 * int read(char[] c) 字符数组
 * int read(char[] c,int.int)
 *
 * 子类FileReader
 *
 * 构造方法：绑定数据源   两个参数File和String
 */
public class ReaderDemo {
    public static void main(String[] args) throws IOException{
        Reader reader = new FileReader("src\\file\\demo.txt");
        int len = 0;
//        while ((len = reader.read()) != -1) {
//            System.out.print((char) len);
//        }
        char[] ch = new char[1024];
        while ((len = reader.read(ch)) != -1) {
            System.out.print(new String(ch,0,len));
        }

        reader.close();
    }
}
