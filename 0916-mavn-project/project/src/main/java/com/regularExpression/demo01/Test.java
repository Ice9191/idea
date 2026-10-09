package com.regularExpression.demo01;

public class Test {
    /**
     * String提供了一个匹配正则表达式的方法
     *  public boolean matches(String regex)：判断字符串是否匹配正则表达式，匹配返回true，不匹配返回false
     *
     * 正则表达式：就是由一些特定的字符组成，代表的是一个规则
     *  作用一：用来校验数据格式是否合法
     *  作用二：在一段文本中查找满足要求的内容
     */
    public static void main(String[] args) {
        /**
         * 需求：校验QQ号码是否正确，要求全部是数字，长度是(6-20)之间，不能以0开头
         */
        System.out.println(test01(null)); // false
        System.out.println(test01("1340980714")); // true
        System.out.println(test01("1340ad0714")); // false

        System.out.println("-------------------------------");

        System.out.println(test02(null)); // false
        System.out.println(test02("1340980714")); // true
        System.out.println(test02("1340ad0714")); // false
    }

    public static boolean test02(String qq){
        // matches()方法：判断当前字符串是否符合规则，规则用正则表达式来表示
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean test01(String qq){
        // 1. 判断qq号码是否为null
        if(qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20) return false;

        // 2. qq至少不是null，不是以0开头，满足6-20之间的长度
        // 判断qq号码中是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            // 根据索引提取当前位置处的字符
            char ch = qq.charAt(i);
            // 判断ch记住的字符，如果不是数字，qq号码不合法
            if(ch < '0' || ch > '9') return false;
        }

        // 3. 说明qq号码肯定是合法的
        return true;
    }
}
