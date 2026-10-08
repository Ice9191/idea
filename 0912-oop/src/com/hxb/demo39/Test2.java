package com.hxb.demo39;

public class Test2 {
    static void main() {

        // 创建StringBuilder的对象（空参构造方法）
        StringBuilder sb = new StringBuilder();
        System.out.println("---" + sb + "@@@@");
        System.out.println(sb.length());

        // 创建StringBuilder的对象（带参构造方法）
        StringBuilder sb1 = new StringBuilder("hello");
        sb1.append("world");
        sb1.append("world12");
        sb1.append("world123");
        sb1.reverse();
        System.out.println(sb1.length());
        System.out.println(sb1);
        String res = sb1.toString();
        System.out.println(res);

        // 在指定位置插入指定的内容
        sb1.insert(5, "insert");
        System.out.println(sb1);
    }
}
