package com.hxb.demo20;

public class Test {
    static void main() {
        /**
         * 多态：事物的多种形态
         * 多态的表现形式：父类类型 对象名称 = 子类对象;
         * 多态的前提：
         *  1. 有继承/实现关系（必须）
         *  2. 有父类引用指向子类对象（必须）（类似，Fu f = new Zi();）
         *  3. 子类重写父类方法（可选）
         * 多态的好处：
         *  1. 方法中使用父类型作为参数，可接收父类对象 + 所有子类对象
         *  2. 如果进行方法重写，利用多态调用方法，可以调用不同子类中重写的方法
         */

        Person stu = new Student("张三", "zhangsan", "123456");
        Person tea = new Teacher("李四", "lisi", "123456");
        Person admin = new Admin("王五", "wangwu", "123456");

        // 多态的使用
        StudentManager sm = new StudentManager();
        sm.register(stu);
        sm.register(tea);
        sm.register(admin);
    }
}
