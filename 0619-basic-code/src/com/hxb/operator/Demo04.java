package com.hxb.operator;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {

        /**
         * 短路逻辑运算符
         * && 短路与 a>1 && a<10 左边为false，右边不执行
         * || 短路或 a>1 || a<10 左边为true，右边不执行
         * 运行规则：先判断左边，左边不成立，右边不执行；左边成立，右边才执行
         */

        // 练习1: 键盘录入一个四位数，判断这个数字是不是回文数(类似1221)
        // 1. 键盘录入一个四位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int num = sc.nextInt();

        // 2. 数字拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
        System.out.println(qian);

        // 3. 判断是否是回文数
        boolean result = ge == qian && shi == bai;
        System.out.println(result);

        // 练习2: 寻找7的有缘数，定义一个两位整数，只要该数字包含7或者是7的倍数，就是7的有缘数
        // 1. 键盘录入一个两位整数
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入一个两位整数：");
        int number = sc2.nextInt();

        // 包含7：个位或者十位是7即可
        // 7的倍数：number % 7 == 0

        // 2. 获取个位和十位
        int ge2 = number % 10;
        int shi2 = number / 10 % 10;

        // 3. 判断当前数字是否是7的有缘数
        boolean result2 = ge2 == 7 || shi2 == 7 || number % 7 == 0;
        System.out.println(result2);
    }
}
