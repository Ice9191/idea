package com.hxb.demo44;

import java.util.Objects;

public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写equals方法
    // s.equals(ss)：调用的是子类Student重写的equals方法
    // this：调用者s，方法里面调用其他方法时，会有一个隐含的this.
    // o：参数ss
    @Override
    public boolean equals(Object o) {
        // this.getClass() != o.getClass()
        // 比较的就是s和ss是不是同一个类型的，如果s是Student，而ss是Person，那么返回false
        if (o == null || this.getClass() != o.getClass()) return false;
        // 表示传递过来的参数不是null，而且和调用者是同一个类型的，所以对o强转为Student类型
        Student student = (Student) o;
        // 比较s和ss的age和name是否相等
        // Objects：操作对象的工具类，提供了一些静态方法
        // 调用的是对象工具类Objects的静态方法equals，把两个字符串传递过去的
        // 这个静态方法equals的底层又调用了String类的equals方法，比较这两个字符串是否相等
        return this.age == student.age && Objects.equals(this.name, student.name);
    }
}
