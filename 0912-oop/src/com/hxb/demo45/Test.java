package com.hxb.demo45;

public class Test {
    /**
     * 获取Integer对象的方式：
     *  1. 利用new + 构造方法获取对象
     *  2. 通过静态方法获取对象
     *  3. 利用直接赋值的方式获取对象
     */

    static void main() {

        // 利用new + 构造方法获取对象
        // 每一次都会在内存中创建一个新的Integer对象
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1);
        System.out.println(i2);

        System.out.println("-----------------");

        // 通过静态方法获取对象
        // 当Integer类被加载到内存中的时候，会提前创建-128 ~ 127之间所有数据的对象，共计256个对象，放入到一个数组（Integer常量池）当中
        // 当我们利用valueOf方法获取对象的时候，判断是否在这个范围当中
        // 如果在，就不会创建新的对象，而是从数组当中获取
        // 如果不在，此时就会利用构造方法的方式去创建对象
        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf("128");
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i3 == i4);

        System.out.println("-----------------");

        // 利用直接赋值的方式获取对象
        // 就是第二种方式的简化写法
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i5 == i6);
    }
}
