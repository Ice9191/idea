package com.hxb.demo33;

public class Test {
    /**
     * String概述：String类，定义在java.lang包中，无需导包。java中的所有字符串文字（例如："hello"、"world"）都为此类的对象
     * String的注意点：字符串的内容是不可变的，它的对象在创建后不能被改变，一旦修改或拼接，就会创建一个新的字符串对象
     * <p>
     * 创建String对象的方式：
     * 1. 直接赋值 String s = "hello";
     * 2. new关键字
     * public String();                空白字符串，不含任何内容
     * public String(String original); 根据传入的字符串，创建新的字符串对象
     * public String(char[] chs);      根据传入的字符数组，创建新的字符串对象
     * public String(byte[] chs);      根据传入的字节数组，创建新的字符串对象
     */
    static void main() {
        // 1. 直接赋值
        // 最简单 最常用 节约内存空间
        String s = "hello";
        System.out.println(s);

        // 2. new + 构造方法的方式创建字符串对象
        // new + 空参构造
        String s1 = new String();
        System.out.println("--" + s1 + "@@"); // ""

        // 3. new + 有参构造
        // 根据传入的字符串，创建一个新的字符串对象
        String s2 = new String(s);
        System.out.println(s2); // hello

        // 4. new + 有参构造（字符数组）
        char[] chs = {'h', 'e', 'l', 'l', 'o'};
        String s3 = new String(chs);
        System.out.println(s3); // hello

        // 5. new + 有参构造（字节数组）
        // ASCII码表
        // 97 -- 'a'
        // 98 -- 'b'
        // 99 -- 'c'
        // 100 -- 'd'
        // 101 -- 'e'
        byte[] bytes = {97, 98, 99, 100, 101};
        String s4 = new String(bytes);
        System.out.println(s4); // abcde

        /**
         * 直接赋值和new关键字的区别
         *
         * 直接赋值的内存结构：
         *  当代码String s = "hello";执行时，此时会在字符串常量池（StringTable，串池）中存储一个字符串对象"hello"
         *  JDK7以前：串池是在方法区的
         *  JDK7以后：串池是在堆内存中的
         *  public class Memory{
         *      public static void main(String[] args) {
         *          String s1 = "hello";
         *          String s2 = "hello";
         *      }
         *  }
         *      1. 先把Memory类的字节码文件加载到方法区中
         *      2. 虚拟机自动调用main方法，main方法加载进栈中，开始执行第一行代码
         *      3. 第一行代码：等号左边：在栈中声明了一个局部变量，名字叫做s1，而数据类型String表示这个变量里面只能存储 字符串的内存地址
         *      4. 第一行代码：等号右边：先查看字符串常量池中是否有"hello"，没有，创建一个新的字符串对象"hello"，并返回地址，s1指向这个地址
         *      5. 第二行代码：等号左边：在栈中声明了一个局部变量，名字叫做s2
         *      6. 第二行代码：等号右边：先查看字符串常量池中是否有"hello"，有，直接返回地址，s2也指向这个地址
         *      注意点：双引号直接赋值的时候，会检查串池，不存在：创建新的，存在：复用（节约内存的根本原因）
         *
         * new关键字出来字符串的内存结构：
         *  public class Memory{
         *      public static void main(String[] args) {
         *          char[] chs = {'a', 'b', 'c'};
         *          String s1 = new String(chs);
         *          String s2 = new String(chs);
         *      }
         *  }
         *      1. 第一行代码：创建了一个字符数组，在堆里面就有一个char类型的数组，再把它的内存地址赋值给chs
         *      2. 第二行代码：等号左边：是在栈里面有个局部变量s1；等号右边：就是在堆里面开辟了一个新的小空间，记录的值就是chs的abc，再把它的内存地址赋值给s1
         *      3. 第三行代码：等号右边又在堆里面开辟了一个新的小空间，记录的值也是chs的abc，再把它的内存地址赋值给s2，这里的内存地址和s1的内存地址是不同的
         *  public class Memory{
         *       public static void main(String[] args) {
         *           String s = "abc";
         *           String s1 = new String(s);
         *           String s2 = new String(s);
         *       }
         *  }
         *      1. 第一行代码：直接赋值，abc存储在字符串常量池中，s指向串池中的abc
         *      2. 第二行代码：在堆内开辟新的小空间，记录的内容就是传入的字符串s，再把它的内存地址赋值给s1
         *      3. 第三行代码：同理，在堆内开辟新的小空间，记录的内容就是传入的字符串s，再把它的内存地址赋值给s2，这里的内存地址和s1的内存地址和s的内存地址都是不同的
         */
    }
}
