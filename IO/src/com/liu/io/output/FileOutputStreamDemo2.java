package com.liu.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * IO的异常处理
 * 细节
 * 1.保证流对象变量，作用域足够
 * 2.catch里面，怎么处理异常
 * 3.如果流对象建立失败了，不用关
 *  new对象的时候，失败了，没有占用系统资源
 *  close的时候判断一下是不是null,若不是，则需释放。
 */
public class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(new File("src\\file\\demo"));
        }catch (IOException em) {
            System.out.println(em.getMessage());
            throw new RuntimeException("文件写入失败，重试");//运行时异常
        }finally {
            try {
                if(outputStream!=null)
                outputStream.close();
            }catch (IOException ex) { }
        }

    }
}
