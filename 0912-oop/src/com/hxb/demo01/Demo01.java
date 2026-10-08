package com.hxb.demo01;

import com.hxb.demo05.Student;

public class Demo01 {
    /**
     * 描述一类事物的类叫javabean类
     * 带有main方法的类叫测试类
     * javabean类可以写属性和方法
     * javabean类中的方法不加static关键字
     */
    static void main() {

        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        System.out.println(s1.getName() + "，" + s1.getAge());
        s1.study();
        s1.sleep();
        s1.eat();

        Student s2 = new Student("李四", 19);
        System.out.println(s2.getName() + "，" + s2.getAge());
        s2.study();
        s2.sleep();
        s2.eat();
    }
}
