package com.hxb.demo28;

public class Test {
    static void main() {
        /**
         * 内部类：在一个类的里面，再定义一个类
         * 内部类表示的事物是外部类的一部分
         * 内部类单独出现没有任何意义
         * 内部类的分类：成员内部类、静态内部类、局部内部类、匿名内部类
         */

        // 创建内部类的对象，并调用show方法
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
