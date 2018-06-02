package com.liu.copyFour;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        long bengintime = System.currentTimeMillis();
        String file1 = "src\\file\\demo.txt";
        String file2 = "src\\fileCopy\\democopy.txt";
        copy_1(new File(file1), new File(file2));
        long endtime = System.currentTimeMillis();
        System.out.println(endtime - bengintime);
    }

    //字节流读写字节数组
    public static void copy_1(File file1, File file2) {

        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file1);
            outputStream = new FileOutputStream(file2);
            int len;
            byte[] bytes = new byte[1024];
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            throw new RuntimeException("重新来过");
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException("关闭错误");
            } finally {
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    throw new RuntimeException("关闭错误");
                }
            }
        }
    }

    //字节流读写单个数组
    public static void copy_2(File file1, File file2) {

        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file1);
            outputStream = new FileOutputStream(file2);
            int len;
            while ((len = inputStream.read()) != -1) {
                outputStream.write(len);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            throw new RuntimeException("重新来过");
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException("关闭错误");
            } finally {
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    throw new RuntimeException("关闭错误");
                }
            }
        }
    }

    //字节流缓冲区读写字节数组
    public static void copy_3(File file1, File file2) {

        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(file1));
            outputStream = new BufferedOutputStream(new FileOutputStream(file2));
            int len;
            byte[] bytes = new byte[1024];
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            throw new RuntimeException("重新来过");
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException("关闭错误");
            } finally {
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    throw new RuntimeException("关闭错误");
                }
            }
        }
    }

    //字节流缓冲区单个字节读写
    public static void copy_4(File file1, File file2) {

        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(file1));
            outputStream = new BufferedOutputStream(new FileOutputStream(file2));
            int len;
            while ((len = inputStream.read()) != -1) {
                outputStream.write(len);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            throw new RuntimeException("重新来过");
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException("关闭错误");
            } finally {
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    throw new RuntimeException("关闭错误");
                }
            }
        }
    }
}
