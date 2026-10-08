package com.hxb.variable;

public class VariableDemo05 {
    public static void main(String[] args) {
        // BMI=体重/身高^2

        double myWeight = 68.9;
        double myHeight = 1.93;

        // 计算BMI
        double bmi = myWeight / (myHeight * myHeight);
        System.out.println(bmi);
    }
}
