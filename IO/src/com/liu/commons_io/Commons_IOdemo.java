package com.liu.commons_io;

import org.apache.commons.io.FilenameUtils;

public class Commons_IOdemo {
    public static void main(String[] args) {
        function_2();
    }
    /**
     * 判断是否以文件结尾
     */
    public static void function_2() {
        System.out.println(FilenameUtils.isExtension("src\\file\\demo.txt","txt"));
    }
    /**
     * 获取文件名
     */
    public static void function_1() {
        System.out.println(FilenameUtils.getName("src\\file\\demo.txt"));
    }

    /**
     * 获得文件后缀名
     */
    public static void function() {
        System.out.println(FilenameUtils.getExtension("src\\file\\demo.txt"));
    }
}
