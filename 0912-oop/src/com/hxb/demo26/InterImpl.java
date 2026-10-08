package com.hxb.demo26;

public class InterImpl implements Inter {
    /**
     * 虚方法表：非static、非final、非private的方法
     *  只有虚方法表里面的方法才能被重写，方法重写的实际意义就是替换了虚方法表中记录方法的内存地址
     */

    // 此时相当于接口和实现类里面刚好有两个同名的方法而已，但是不构成重写关系
    /*@Override
    public static void interShow(){
        System.out.println("InterImpl interShow");
    }*/
}
