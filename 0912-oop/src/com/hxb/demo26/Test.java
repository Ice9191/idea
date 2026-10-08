package com.hxb.demo26;

public class Test {
    static void main() {
        /**
         * 接口的新特性
         *  JDK7及以前：接口中只能定义抽象方法
         *  JDK8新特性：为了接口升级时向下兼容，接口中可以定义有方法体的方法（默认方法、静态方法）
         *  JDK9新特性：为了抽取重复代码，接口中可以定义私有方法（私有普通方法、私有静态方法）
         *
         * JDK8以后接口中新增的方法
         *  允许在接口中定义默认方法，需要使用关键字default修饰
         *      作用：为了接口升级时，代码不报错
         *  接口中默认方法的定义格式
         *      格式：public default 返回值类型 方法名(参数列表) {...}
         *      范例：public default void show() {...}
         *  接口中默认方法的注意事项：
         *      1. 默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字
         *      2. public可以省略，default不能省略
         *      3. 如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
         *
         *  允许在接口中定义静态方法，需要使用关键字static修饰
         *  接口中静态方法的定义格式
         *      格式：public static 返回值类型 方法名(参数列表) {...}
         *      范例：public static void show() {...}
         *  接口中静态方法的注意事项：
         *      1. 静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
         *      2. public可以省略，static不能省略
         */

        Inter.interShow();

        // 报错
        /*InterImpl i = new InterImpl();
        i.interShow();*/
    }
}
