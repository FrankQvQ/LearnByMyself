package com.liu.io.copy;

import java.io.*;

//通过数组缓冲提高效率
public class CopyYouhua {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        InputStream fis = null;
        OutputStream fos = null;
        try {
            fis = new FileInputStream(new File("src\\file\\demo.txt"));
            fos = new FileOutputStream(new File("src\\fileCopy\\democopy.txt"));
            byte[] bytes = new byte[1024 * 10];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
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
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
