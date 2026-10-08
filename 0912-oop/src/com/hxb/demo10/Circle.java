package com.hxb.demo10;

public class Circle {
    private double radius;
    private final double PI = 3.14;

    // 构造方法
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // get/set方法
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    // 行为
    public double getArea() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }
}
