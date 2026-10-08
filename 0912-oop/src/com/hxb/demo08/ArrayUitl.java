package com.hxb.demo08;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class ArrayUitl {
    // 私有化构造方法，防止外界创建对象
    private ArrayUitl() {
    }

    // 定义静态方法
    public static String printArray(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i] + "]";
            } else {
                result += arr[i] + ", ";
            }
        }
        return result;
    }
}
