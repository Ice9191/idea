package com.parent;

public class Father {
    // 1. 私有权限：只能在自己类内部访问
    private String privateVal = "我是私有变量";

    // 2. 默认权限（无修饰符）：只能被同一个包(com.parent)下的类访问
    String defaultVal = "我是默认变量";

    // 3. 受保护权限：同包可访问 + 不同包的子类可继承访问
    protected String protectedVal = "我是受保护变量";

    // 4. 公共权限：谁都能访问
    public String publicVal = "我是公共变量";

    // 在本类中，所有属性都可以访问
    public void showInself() {
        System.out.println(privateVal);
        System.out.println(defaultVal);
        System.out.println(protectedVal);
        System.out.println(publicVal);
    }
}
