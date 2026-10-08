package com.FileNIO.Demo22;

import java.io.Serializable;

// 注意：对象如果需要序列化，必须实现序列化接口
// Serializable接口是一个标记接口，是给虚拟机程序看的
public class User implements Serializable {
    private String loginName;
    private String username;
    private int age;
    // 如何实现用户密码不参与序列化，并且后面还可以使用到user的密码呢？
    // 加入transient关键字，告诉虚拟机，这个字段不参与序列化，此时密码为null
    private transient String password;

    public User() {
    }

    public User(String loginName, String username, int age, String password) {
        this.loginName = loginName;
        this.username = username;
        this.age = age;
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
