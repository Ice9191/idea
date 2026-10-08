package com.hxb.operator;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {

        /**
         * 需求：初始最大生命值200，受到x点伤害，技能恢复y点生命值，x和y由键盘录入
         * 假设，游戏人物不会死亡，最少1点生命值
         * 问，最终游戏人物的生命值是多少？
         */

        // 1.定义一个变量表示初始最大生命值
        int maxHealth = 200;

        // 2.键盘录入一个值，表示当前人物受到的伤害
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前人物受到的伤害：");
        int damage = scanner.nextInt();

        // 3.计算当前的生命值
        maxHealth -= damage;

        // 4.如果当前的生命值小于等于0，设置为1
        if (maxHealth <= 0) {
            maxHealth = 1;
        }

        System.out.println("当前人物的生命值为：" + maxHealth);

        // 5.键盘录入一个变量，表示技能恢复的生命值
        System.out.println("请输入技能恢复的生命值：");
        int add = scanner.nextInt();

        // 6.计算最终的生命值
        maxHealth += add;

        if (maxHealth > 200) {
            maxHealth = 200;
        }

        System.out.println("最终游戏人物的生命值为：" + maxHealth);
    }
}
