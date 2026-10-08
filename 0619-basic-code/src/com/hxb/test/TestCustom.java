package com.hxb.test;

public class TestCustom {
    // 场景：普通的 User 类，不重写 equals() 方法
    public static void main(String[] args) {
        User u1 = new User("小明");
        User u2 = new User("小明");

        // 比较地址：u1 和 u2 是两个 new 出来的不同对象，地址肯定不同
        System.out.println(u1 == u2);
        // false

        // 因为 User 没有重写 equals，所以调用了 Object 父类的 equals（即底层还是 ==）
        System.out.println(u1.equals(u2));
        // false（因为地址不同）

        // 如果我们想让 equals 比较名字内容，就必须在 User 类中手动重写 equals 方法。
        // 初学者记住：只要你不重写，自定义类的 equals 结果永远和 == 一样。
    }
}

class User {
    String name;
    User(String name){
        this.name = name;
    }
}
