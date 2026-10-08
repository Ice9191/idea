package com.hxb.demo10;

public class Test {
    /**
     * final关键字：表示最终，不可变。可以修饰变量、类、方法
     *  特点：
     *      1. 只能赋值一次，数据不可变
     *      2. 名字大写，多个单词下划线隔开
     *
     * 基本数据类型：byte short int long float double char boolean
     *  变量里面记录的是真实的数据
     *  final int NUM = 100; 此时变量里面记录的数据无法发生改变
     *
     * 引用数据类型：除了基本数据类型，其他都是引用数据类型
     *  变量里面记录的是引用地址
     *  final Student stu = new Student(); 此时变量里面记录的是引用地址，无法发生改变，但是对stu的属性值可以改变
     *
     * 综上：final修饰哪个变量，这个变量里面记录的内容就无法再次发生改变
     */
    static void main() {
        // 定义一个常量
        final int NUM = 100;
        System.out.println(NUM);

        Circle c = new Circle(3);

        System.out.println(c.getPI());
        System.out.println(c.getRadius());

        System.out.println(c.getArea());
        System.out.println(c.getLength());
    }
}
