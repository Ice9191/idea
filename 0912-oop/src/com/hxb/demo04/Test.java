package com.hxb.demo04;

public class Test {
    /**
     * 构造方法：也叫构造器、构造函数
     * 作用：在创建对象的时候给成员变量进行初始化的
     * 格式：
     * 修饰符 类名(参数1，参数2，...){
     * 方法体;
     * }
     * 特点：
     * 1. 方法名与类名相同，大小写也要一致
     * 2. 没有返回值类型，连void都没有
     * 3. 没有具体的返回值（不能由return带回结果数据）
     * 执行时机：
     * 1. 创建对象的时候由虚拟机调用，不能手动调用构造方法
     * 2. 每创建一次对象，就会调用一次构造方法
     */
    static void main() {

        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getHeight());

        Student ss = new Student("张三", 18, "男", 170);
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
        System.out.println(ss.getGender());
        System.out.println(ss.getHeight());
    }
}
