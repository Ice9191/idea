package com.hxb.demo32;

import java.util.Random;

public class Test {
    /**
     * API(Application Programming Interface)：应用程序编程接口
     * 简单理解：就是JDK提供的各种功能的java类。我们不需要自己编写，直接使用即可。
     * 这些类将底层的实现封装了起来，我们不需要关心这些类是如何实现的，只要学会如何使用即可。
     * API帮助文档：帮助开发人员更好的使用API和查询API的一个工具。
     * <p>
     * 如何使用API帮助文档：
     * 1. 打开API帮助文档
     * 2. 点击显示，并找到索引下面的输入
     * 3. 在输入框中输入类名并点击显示
     * 4. 查看类所在的包
     * 5. 查看类的描述
     * 6. 查看构造方法
     * 7. 查看成员方法
     * <p>
     * 在什么情况下，我不需要导包？
     * 情况一：如果使用本包中的类
     * 情况二：如果使用java.lang（核心）包中的类
     * 其他所有情况下，都需要导包
     */
    static void main() {

        // 创建Random对象
        Random r = new Random();

        // 调用方法获取一个随机小数
        double d1 = r.nextDouble();
        System.out.println(d1);

        double d2 = r.nextDouble(1.9);
        System.out.println(d2);

        System.out.println("-----------------");

        for (int i = 0; i < 100; i++) {
            double d3 = r.nextDouble(2, 5);
            System.out.println(d3);
        }
    }
}
