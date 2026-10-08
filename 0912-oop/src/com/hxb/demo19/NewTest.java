package com.hxb.demo19;

import com.hxb.demo18.Person;

public class NewTest {
    static void main() {

        // 不同包下的无关类
        Person p = new Person();
        System.out.println(p.name);
        p.test();
    }
}
