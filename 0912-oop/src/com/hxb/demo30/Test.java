package com.hxb.demo30;

public class Test {
    static void main() {
        /**
         * 局部内部类：
         *  1. 将内部类定义在方法里面就叫做局部内部类，类似于方法里面的局部变量
         *  2. 外界是无法直接使用，需要在方法内部创建对象并使用
         *  3. 该类可以直接访问外部类的成员，也可以访问方法内的局部变量
         */

        // 无法直接使用show方法里面的局部变量a
        Outer o = new Outer();
        // 这里的a是外部类的成员变量
        System.out.println(o.a);

        // 调用show方法
        o.show();
    }
}
