package com.hxb.demo27;

public class Test {
    static void main() {
        /**
         * JDK9新增的私有方法
         *  为了抽取默认方法和静态方法中重复代码而出现的
         *  普通的私有方法：给默认的default方法服务的，多个default方法中有重复代码，就用普通的私有方法抽取出来
         *      格式1：private 返回值类型 方法名(参数列表) {...}
         *      范例1：private void show() {...}
         *  静态的私有方法：如果是多个静态方法中有重复代码，就用静态的私有方法抽取出来
         *      格式2：private static 返回值类型 方法名(参数列表) {...}
         *      范例2：private static void method() {...}
         */

        InterImpl i = new InterImpl();
        // JDK8中是可以调用的，但是check()是只为接口服务的，调用没有意义
        // JDK9中会报错
        // i.check();
    }
}
