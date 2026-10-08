package com.hxb.demo03;

public class This {
    /**
     * 直接使用成员变量，需要this关键字前缀
     */

    // 成员变量
    private int a;

    /*public void setA(int val){
        // val为局部变量
        a = val;
    }*/

    /*public void setA(int a){
        // 就近原则：先使用局部变量，再使用成员变量，这里三个a都是局部变量
        a = a;
        System.out.println(a);
    }*/

    public void setA(int a){
        this.a = a;
        System.out.println(this.a);
    }

    public int getA(){
        return a;
    }
}
