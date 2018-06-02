package com.liu.io_propertise_ObjectStream;

import com.liu.io_propertise_ObjectStream.person.Person;

import java.io.*;

/**
 * 实现对象Persond的序列化与反序列化
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws Exception{
//        writeObject();
        readObject();
    }

    public static void readObject() throws IOException,ClassNotFoundException{
        FileInputStream fis = new FileInputStream(new File("src\\file\\demo.txt"));
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }

    //序列化
    public static void writeObject() throws IOException{
        //创建字节输出流，封装文件
        FileOutputStream fos = new FileOutputStream(new File("src\\file\\demo.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person("lisi",22);
        oos.writeObject(person);
        oos.close();
    }
}
