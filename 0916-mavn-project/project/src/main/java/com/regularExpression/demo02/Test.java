package com.regularExpression.demo02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    /**
     * 使用正则表达式查找内容
     */
    public static void main(String[] args) {
        test01();
    }

    public static void test01() {
        String data = "sb正在学习Java，\n" +
                "电话：18666688888，18699997777\n" +
                "或者联系邮箱：boniu@hxb91.cn，\n" +
                "座机电话：01036517895，010-98951256\n" +
                "邮箱：bozai@hxb91.cn，\n" +
                "邮箱：dlei0009@163.com，\n" +
                "热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";

        // 1. 定义爬取规则
        String regex = "1[3-9]\\d{10}|0\\d{2,3}-?\\d{5,10}|400-?\\d{3}-?\\d{4}|[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

        // 2. 把正则表达式封装成一个Pattern对象
        Pattern pattern = Pattern.compile(regex);

        // 3. 通过Pattern对象去获取查找内容的匹配器对象
        Matcher matcher = pattern.matcher(data);

        // 4. 定义一个循环开始爬取信息
        while (matcher.find()){
            String result = matcher.group(); // 获取到了找到的内容
            System.out.println(result);
        }
    }
}
