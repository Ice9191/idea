package com.hxb;

import com.hxb.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class demo02 {
    /**
     * JDBC-查询数据
     *  需求：基于JDBC执行如下select语句，将查询结果封装到User对象中
     *  SQL：select * from user where username = 'daqiao' and password = '123456'
     *
     * ResultSet(结果集对象)：ResultSet rs = statement.executeQuery();
     *  ResultSet对象里面就封装了SQL查询返回的所有数据
     *  常见方法：
     *      boolean next()：将光标从当前位置向前移动到下一行，光标默认第一行的上一行，并判断当前行是否为有效行，返回值为boolean
     *          如果是true：有效行，当前行有数据
     *          如果是false：无效行，当前行没有数据
     *      ResultSet getXxx(int columnIndex)：根据列的索引获取列的值。Xxx表示数据类型，如：getInt、getString等。(推荐)
     *      ResultSet getXxx(String columnLabel)：根据列的标签获取列的值。Xxx表示数据类型，如：getInt、getString等。(推荐)
     */
    @Test
    public void testSelect(){
        // 数据库连接参数
        String url = "jdbc:mysql://localhost:3306/jdbc_demo_db";
        String username = "root";
        String password = "Test@123456";

        Connection connection = null;
        PreparedStatement statement = null;
        // 这个对象是用来封装查询返回的结果的，也叫查询返回的结果集对象
        ResultSet rs = null;

        try{
            // 1. 注册jdbc驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 获取数据库连接
            connection = DriverManager.getConnection(url, username, password);

            // 3. 执行查询语句
            // 这里的?是占位符，并没有将参数直接写死，用于代替SQL语句中的参数，防止SQL注入
            // 这里的sql语句是预编译sql语句，也是在项目开发中推荐使用的sql语句，因为性能更高、安全性更好
            String sql = "select id, username, password, name, age from user where username = ? and password = ?";

            // 4. 获取执行SQL语句的对象
            statement = connection.prepareStatement(sql);
            // 为两个占位符赋值，1代表第一个占位符，2代表第二个占位符
            statement.setString(1, "daqiao");
            statement.setString(2, "123456");
            rs = statement.executeQuery();

            // 5. 处理结果集
            while (rs.next()){
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("name"),
                        rs.getInt("age")
                );
                System.out.println(user);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 6. 关闭资源
            try {
                if(rs != null)rs.close();
                if(statement != null)statement.close();
                if(connection != null)connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
