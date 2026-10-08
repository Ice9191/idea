package com.hxb.demo16;

public class Test {
    static void main() {
        /**
         * 继承中构造方法的特点：
         *  1. 父类中的构造方法不会被子类继承，只能通过super关键字调用
         *  2. 如果子类的构造方法不写super，JVM也会加一个默认的super()，先访问父类的无参构造
         *
         * 小细节：
         *  1. 子类构造方法第一行，有一个默认的super()，如果我们没有书写，JVM也会自动加上
         *  2. 如果想要访问父类的带参构造，super(参数)必须手动在第一行写上，不能省略
         *  3. 在创建对象的时候，先执行父类的构造方法，再执行子类的构造方法
         */

        // 创建子类对象
        Student s = new Student("张三",18,"高一");
        System.out.println(s.name+", "+s.age+", "+s.grade);

        Teacher t = new Teacher();
        System.out.println(t.name+", "+t.age+", "+t.subject);
    }
}
