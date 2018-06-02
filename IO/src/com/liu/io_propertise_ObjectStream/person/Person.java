package com.liu.io_propertise_ObjectStream.person;

import java.io.Serializable;

public class Person implements Serializable{
    //自定义序列号，编译器就不会计算序列号
    static final long serialVersionUID = 707854553;
    private String name;
    public   /*transient/*阻止这个成员变量序列化*/ int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
