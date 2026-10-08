package com.hxb.demo37;

import javax.script.AbstractScriptEngine;
import java.util.Scanner;

public class Test {
    /**
     * 敏感词过滤
     * String replace(旧值, 新值)   替换（只有返回值才是替换之后的结果）
     *
     * subString截取：截取固定位置的数据
     * replace替换：位置不确定，替换指定内容
     */

    static void main() {

        String str = "你玩的好菜呀，cnm";

        // 替换
        String s = str.replace("cnm", "***");
        System.out.println(s);

        // 骂人的话有很多，先定义一个敏感词库
        String[] arr = {"tmd", "sb", "lj", "cnm", "cnmb", "nmd"};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要说的话：");
        String msg = sc.next();

        // 替换敏感词
        for (int i = 0; i < arr.length; i++) {
            // arr[i]：依次表示数组当中每一个敏感词
            msg = msg.replace(arr[i], "***");
        }

        System.out.println(msg);
    }
}
