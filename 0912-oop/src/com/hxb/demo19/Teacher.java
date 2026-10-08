package com.hxb.demo19;

import com.hxb.demo18.Person;

public class Teacher extends Person {

    // 不同包下的子类
    public void show(){
        System.out.println(name);
        super.test();
    }
}
