package com.collection.demo06;

import java.util.Arrays;

/**
 * 当我在编写一个类的时候，如果不确定类型，那么这个类就可以定义为泛型类
 * @param <E>
 */
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    /**
     * E：表示是不确定的类型，该类型在类名后面已经定义过了
     * e：形参的名字，变量名
     * @param e
     * @return
     */
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        // 获取数据时，需要进行强制类型转换，java源码也是这么干的
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
