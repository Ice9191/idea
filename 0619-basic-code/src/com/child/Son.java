package com.child;

import com.parent.Father;

class NewFather {
    private String car;

    // 父类有參构造
    public NewFather(String car){
        this.car = car;
        System.out.println("老爸有辆车：" + car);
    }
}



public class Son extends Father {
    public void test(){
        System.out.println();
    }
}
