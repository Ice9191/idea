package com.hxb.operator;

import java.security.PublicKey;

public class Demo17 {
    public static void main(String[] args) {

        /**
         * 方法：程序中的独立功能，也是最小的执行单元
         * 使用场景：经常使用的代码打包，放在方法当中
         * 好处：提高了程序的复用性和可维护性
         * 方法定义的格式：
         * public static 返回值类型 方法名(参数1,参数2,...){
         *     方法体;
         *     return 返回值;
         * }
         * 方法调用的格式：
         * 方法名(参数1,参数2,...);
         * 注意点：
         * 1. 方法和方法之间是平级关系，不能相互嵌套（写在main方法外）
         * 2. 方法不会主动运行，必须调用才会执行
         * 3. 小括号中的参数需要一一对应，不能多也不能少（个数、类型、顺序都要匹配）
         */

        int result = sum(1, 2);
        System.out.println(result);
    }

    // 定义一个方法用于求和
    public static int sum(int a, int b) {
        return a + b;
    }
}
