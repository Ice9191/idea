package com.hxb.test;

/**
 * 面向对象的三大特征：封装、继承、多态
 * 1. 封装：将数据和方法封装起来，只暴露必要的接口
 * 2. 继承：一个类可以继承另一个类的属性和方法
 * 3. 多态：一个类可以有多个子类，每个子类可以有不同的实现
 */
public class Student {
    // 属性用private修饰，外部不能直接访问
    private String name;
    private int age;

    // 通过公开的getter方法获取属性值
    public String getName() {
        return name;
    }

    // 通过公开的setter方法设置属性值
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 封装的好处：可以在赋值前做逻辑判断，保护数据合理性
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄不合法！");
        }
    }
}
