package com.liu.io_propertise_ObjectStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        function_3();
    }

    private static void function_3() throws IOException {
        Properties pro = new Properties();
        pro.setProperty("name", "zhangsan");
        pro.setProperty("age", "30");
        pro.setProperty("email", "707854553@qq.com");
        FileWriter fw = new FileWriter(new File("src\\file\\demo.txt"));
        pro.store(fw,"刘雨皓");
        fw.close();
    }

    public static void function_2() throws IOException {
        Properties pro = new Properties();
        FileReader fileReader = new FileReader(new File("src\\file\\demo.txt"));
        pro.load(fileReader);
        fileReader.close();
        for (Map.Entry<Object, Object> en : pro.entrySet()) {
            System.out.println((String) en.getKey() + (String) en.getValue());
        }
    }

    public static void function_1() {
        Properties pro = new Properties();
        pro.setProperty("a", "memecha");
        pro.setProperty("b", "memecha");
        pro.setProperty("c", "memecha");

//        for (Object demo: pro.keySet()) {
//            System.out.println(pro.getProperty((String) demo));
//        }

        String value = pro.getProperty("a");
        System.out.println(value);

        Set<String> set = pro.stringPropertyNames();
        for (String demo : set) {
            System.out.println(demo);
        }
    }
}
