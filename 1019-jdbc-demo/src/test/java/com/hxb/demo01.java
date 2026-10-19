package com.hxb;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class demo01 {
    /**
     * JDBC-入门程序
     *  需求：基于JDBC程序，执行update语句(update user set age = 25 where id = 1)
     *  步骤：
     *      1. 准备工作：创建一个maven项目，引入Mysql驱动依赖；并准备数据库表user
     *      2. 代码实现：编写JDBC程序，操作数据库
     */
    @Test
    public void testUpdate() throws Exception {
        // 1. 注册驱动：将驱动类加载到内存当中即可，这里使用的就是mysql的驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. 获取数据库的连接
        // jdbc:mysql://这部分是固定的，代表我们要使用jdbc程序来操作mysql数据库
        // localhost:3306这部分代表数据库的ip地址和端口号
        // jdbc_demo_db这部分代表指定的数据库名称
        String url = "jdbc:mysql://localhost:3306/jdbc_demo_db";
        String username = "root";
        String password = "Test@123456";
        Connection connection = DriverManager.getConnection(url, username, password);

        // 3. 获取sql语句的执行对象
        Statement statement = connection.createStatement();

        // 4. 执行sql语句
        // DML
        int i = statement.executeUpdate("update user set age = 99 where id = 1");
        // i表示当前这次操作影响的记录数
        System.out.println("SQL执行完毕影响的记录数为：" + i);

        // 5. 释放资源
        statement.close();
        connection.close();
    }
}
