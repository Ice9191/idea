package com.regularExpression.demo03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    /**
     * 正则表达式用于搜索替换、分割内容，需要结合String提供的如下方法完成：
     *  public String replaceAll(String regex, String newStr)：按照正则表达式匹配的内容进行替换
     *  public String[] split(String regex)：按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组
     */
    public static void main(String[] args) {
        // test01();
        // test02();
        test03();
    }

    public static void test01(){
        // 将str中间的非中文字符替换成"-"
        String str = "古力娜扎ai8888迪丽热巴9999aa5566马尔扎哈fbbfsfs42425卡尔扎巴";
        System.out.println(str.replaceAll("\\w+", "-"));
    }

    public static void test02(){
        // 一个口吃的人说的话，优化成：我喜欢编程
        String str = "我我我喜欢喜欢编编编编编编编编编编编编程程程程程";
        System.out.println(str.replaceAll("(.+?)\\1+", "$1"));
    }

    public static void test03(){
        // 把str中的人名拿出来
        String str = "古力娜扎ai8888迪丽热巴9999aa5566马尔扎哈fbbfsfs42425卡尔扎巴";
        String[] names = str.split("\\w+");
        System.out.println(Arrays.toString(names));
    }
}
