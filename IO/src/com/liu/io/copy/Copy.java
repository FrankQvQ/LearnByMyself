package com.liu.io.copy;

import java.io.*;

/**
 * 数据源file:demo.txt
 * 复制到filecopy 输入目的
 * 字节输入流，绑定数据源
 * 字节输出流，绑定数据目的
 *
 * //一个字节一个字节的复制，很慢很慢
 */
public class Copy {
    public static void main(String[] args) {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            fis = new FileInputStream(new File("src\\file\\demo.txt"));
            fos = new FileOutputStream(new File("src\\fileCopy\\democopy.txt"));
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        }catch (IOException ex) {
            System.out.println(ex);

        }finally {
            try {
                if (fos!=null) fos.close();
            }catch (IOException ex){
                throw  new RuntimeException("释放资源失败");
            }finally {
                try {
                    if (fis!=null) fis.close();
                }catch (IOException ex){
                    throw  new RuntimeException("释放资源失败");
                }
            }
        }
    }
}
