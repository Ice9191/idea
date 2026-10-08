package com.hxb.demo02;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Dog {
    // 属性
    private String name;
    private int age;

    // get/set方法
    public void setName(String val) {
        name = val;
    }

    public String getName() {
        return name;
    }

    public void setAge(int val) {
        if (val >= 0 && val <= 15) {
            age = val;
        } else {
            System.out.println("年龄范围错误");
        }
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println(age + "岁的" + name + "正在吃");
    }
}
