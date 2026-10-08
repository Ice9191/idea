package com.hxb.demo12;

import com.hxb.demo11.OrderStatus;

public class Test {
    /**
     * 枚举的注意事项：
     *  1. 每一个枚举项，都是该枚举类的对象，每一个对象都是通过构造方法创建的
     *  2. 枚举项在底层其实就是常量，默认用public static final修饰
     *  3. 枚举类的第一行上必须是枚举项，枚举项之间用逗号隔开，以分号结尾
     *  4. 枚举类的构造方法必须是private修饰，不让外界创建本类的对象
     *  5. 编译器会给枚举类新增两个默认存在的方法：values()和valueOf()
     *
     * values()方法：表示获取本类所有的枚举项
     * valueOf()方法：表示获取一个指定的枚举项
     */
    static void main() {

        OrderStatus status = OrderStatus.CANCELLED;

        OrderStatus[] arr = OrderStatus.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-----------------");

        OrderStatus val = OrderStatus.valueOf("PAYMENT_PENDING");
        System.out.println(val);
    }
}
