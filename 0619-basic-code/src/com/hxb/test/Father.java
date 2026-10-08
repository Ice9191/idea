package com.hxb.test;

public class Father {
    // 这是一条家规，不允许后代改变
    public final void familyRule(){
        System.out.println("晚上9点前必须回家");
    }

    public void hobby(){
        System.out.println("我喜欢钓鱼");
    }
}
