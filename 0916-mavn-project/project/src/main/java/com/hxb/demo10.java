package com.hxb;

public class demo10 {
    /**
     * 自定义异常：java中的异常都是Throwable类或者Exception类（编译时异常）或者RuntimeException类（运行时异常）的子类，那么我们要创建一个自定义的异常，其实就是创建其对应的子类
     */

    public static void main(String[] args) {

        try {
            System.out.println(getScore());
        } catch (ScoreException e) {
            e.printStackTrace();
        }

        System.out.println("程序继续执行");
    }

    // 获取成绩
    public static double getScore() throws ScoreException {
        double score = 101;
        if(score < 0 || score > 100){
            throw new ScoreException("成绩范围错误");
        }
        return score;
    }
}

// 自定义异常类
class ScoreException extends Exception {
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}
