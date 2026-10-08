package com.hxb.operator;

public class Demo12 {
    public static void main(String[] args) {

        /**
         * break关键字：不能单独出现，必须写在switch或者循环当中，表示结束、跳出的意思
         * continue关键字：不能单独出现，必须写在循环当中，表示结束本次循环，继续下一次循环，不执行循环体中的其他代码
         */

//        for (int i = 0; i < 100; i++) {
//            if(i == 50){
//                break;
//            }
//            System.out.println(i);
//        }

        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                continue;
            }
            System.out.println(i);
        }
    }
}
