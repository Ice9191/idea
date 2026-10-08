package com.hxb.variable;

import java.util.Scanner;

public class VariableDemo08 {
    public static void main(String[] args) {
        // MBI=体重/身高^2

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重（单位：千克）：");
        double myWeight = sc.nextDouble();
        System.out.println("请输入身高（单位：米）：");
        double myHeight = sc.nextDouble();

        double bmi = myWeight / (myHeight * myHeight);
        System.out.println("您的BMI值为：" + bmi);
    }
}
