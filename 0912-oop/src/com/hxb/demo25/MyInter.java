package com.hxb.demo25;

public interface MyInter extends Inter, Inter01 {
    /**
     * 注意：如果有一个接口A继承了多个接口，此时相当于是把多个接口中的抽象方法全部继承下来了，
     * 在以后，实现类实现接口A的时候，就要把所有的抽象方法进行重写
     */
}
