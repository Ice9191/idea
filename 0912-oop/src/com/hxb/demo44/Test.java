package com.hxb.demo44;

public class Test {
    /**
     * Object是java中的顶级父类，所有的类都直接或者间接继承自Object类
     * Object类中的方法可以被所有类访问，我们要学习这些方法
     *  public String toString()：返回对象的字符串表示形式
     *  public boolean equals(Object obj)：判断两个对象是否相等
     */

    static void main() {

        Student s = new Student("张三", 18);
        String str = s.toString();
        // Object类中的toString方法，默认会返回对象的内存地址
        // 但是内存地址我们看上去是没有任何意义，我想要把一个对象变成字符串，真正想看到的是对象的属性值
        // 所以，父类中的方法不能满足子类的需求了，所以我们就要在子类中重写toString方法
        System.out.println(str); // com.hxb.demo44.Student@8efb846（内存地址）
        /*
            Object类中的源码
            // 返回的就是对象的内存地址
            public String toString() {
                // getClass()：获取当前调用者的字节码文件
                // getName()：获取这个字节码文件的名字
                // "@"：间隔符号，将包名和后面16进制的内存地址隔开
                // hashCode()：获取对象的内存地址
                // Integer.toHexString()：将内存地址转换为16进制的表现形式
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
        */

        // 如果想要把一个对象变成字符串并打印，其实不需要手动调用toString方法，直接打印对象即可
        System.out.println("-----------------");
        /**
         * 输出语句的含义：
         *  System：java中已经写好的一个工具类，表示系统
         *  out：是System里面的一个静态变量，默认初始化值是null，但是在程序启动之后，会对out进行赋值，记录控制台的对象，所以在打印的时候会把数据打印在控制台上
         *  System.out：就是一个对象
         *  println()：打印方法，作用是将对象的字符串表示形式打印到控制台
         *  s：调用方法的时候传递的实参
         *
         * 输出语句的运行过程：
         *  在打印的时候，println方法的内部调用了对象的toString方法，如果Student中没有重写这个方法，就会调用Object类中的toString方法，打印对象的内存地址
         * 习惯：
         *  因此，一般来讲都会在javabean类中重写toString方法，打印对象的时候显示对象的属性值
         */
        System.out.println(s); // Student{name='张三', age=18}
    }
}
