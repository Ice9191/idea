package com.hxb.demo14;

public class Zi extends Fu {
    String name = "Zi";

    public void ziShow(){
        // 输出Zi
        System.out.println(name);
        System.out.println(this.name);

        // 输出Fu
        System.out.println(super.name);

        // 输出"北京"
        System.out.println(address);
        System.out.println(this.address);
        System.out.println(super.address);
    }
}
