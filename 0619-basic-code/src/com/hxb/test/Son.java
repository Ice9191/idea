package com.hxb.test;

public class Son extends Father{
    // 尝试重写familyRule方法会报错，因为final修饰的方法不能被重写
//    @Override
//    public void familyRule() {
//        System.out.println("晚上7点前必须回家");
//    }

    // 但是可以重写非final方法
    @Override
    public void hobby(){
        System.out.println("我喜欢打游戏");
    }
}
