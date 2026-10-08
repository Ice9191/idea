package com.hxb.demo15;

public class ThirdPhone extends SecondPhone {

    /**
     * 注解/注释：都是对代码的解释说明
     * 注释：给程序员看的
     * 注解：给虚拟机看的
     */

    @Override
    public void call() {
        System.out.println("打视频通话");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }
}
