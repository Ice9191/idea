package com.hxb.variable;

import javax.swing.*;

public class VariableDemo02 {
    public static void main(String[] args) {
    /*
        我方：叉子               对方：长手
        攻击：220                攻击：210
        防御：85                 防御：80
        血量：1012.5             血量：1223.3
        技能加成：1.2             技能加成：1.3
        技能造成伤害的公式：攻击力* 技能加成 - 对方防御力
        普攻造成伤害的公式：攻击力 - 对方防御力
        计算：
        我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
        我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
        规则：经常发生改变的数据，用变量记录
     */

        // 定义变量记录我方数据
        int myAttack = 220;
        int myDefense = 85;
        double myHealth = 1012.5;
        double mySkillAdd = 1.2;

        // 定义变量记录敌方数据
        int enemyAttack = 210;
        int enemyDefense = 80;
        double enemyHealth = 1223.3;
        double enemySkillAdd = 1.3;

        // 计算我方第一次普通普通攻击造成的伤害
        double myNormalDamage = myAttack - enemyDefense;
        System.out.println("我方第一次普通普通攻击造成的伤害：" + myNormalDamage);
        double enemyNowHealth = enemyHealth - myNormalDamage;
        System.out.println("敌方受到第一次普通普通攻击后，还剩余血量：" + enemyNowHealth);

        // 我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
        double mySkillDamage = myAttack * mySkillAdd - enemyDefense;
        System.out.println("我方第二次技能攻击造成的伤害：" + mySkillDamage);
        enemyNowHealth -= mySkillDamage;
        System.out.println("敌方受到第二次技能攻击后，还剩余血量：" + enemyNowHealth);
    }
}
