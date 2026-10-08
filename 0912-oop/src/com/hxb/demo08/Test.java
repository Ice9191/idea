package com.hxb.demo08;

public class Test {
    /**
     * static关键字的内存解析：静态变量是随着类的加载而加载的，优先于对象出现的，只有在虚拟机关闭时才会被销毁
     * static不属于对象，属于类
     *
     * static修饰成员方法：
     *  特点：
     *      1. static修饰的方法叫做静态方法
     *      2. 该方法多用在测试类和工具类中
     *      3. javabean类中很少会用
     *  调用方式：
     *      1. 类名调用
     *      2. 对象名调用
     *
     *  测试类：带main方法的类，是程序的主入口
     *
     *  工具类：不是用来描述一类事物的，也没有main方法，而是帮我们做一些事情的类（比如遍历数组、求最大值、求最小值等）
     *      1. 类名见名知意
     *      2. 私有化构造方法
     *      3. 所有的方法都是static方法
     */

    static void main() {
        int[] arr = {1,2,3,4,5};
        String res = ArrayUitl.printArray(arr);
        System.out.println(res);
    }
}
