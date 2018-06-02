package com.liu.file;

import java.io.File;

public class FileBuild {
    public static void main(String[] args) {
        function_1();
    }

    public static void function_1()  {
        File file = new File("src//memecha");
        try {
            boolean n = file.createNewFile();
            System.out.println(n);
        }catch (Exception m){

        }finally {
            file.delete();
        }
    }


}
