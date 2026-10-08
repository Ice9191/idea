package com.Reflection.Demo01;

public class BigStar implements Star {
    private String name;

    public BigStar(){}

    public BigStar(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 唱、跳方法
    @Override
    public String sing(String name){
        System.out.println(this.name + "正在唱" + name);
        return "谢谢";
    }

    @Override
    public void jump(){
        System.out.println(name + "正在跳");
    }
}
