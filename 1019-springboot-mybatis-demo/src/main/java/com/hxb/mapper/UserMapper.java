package com.hxb.mapper;

import com.hxb.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// 当加上@Mapper注解之后，就表示这个接口是一个MyBatis的持久层接口，不然就是一个普通接口
// 也表示应用程序在运行时，会自动的为该接口创建一个实现类对象(这个实现类对象是一个代理对象，所以我们只能编写接口，不需要编写实现类的)，并且会自动将该实现类对象存入IOC容器中，成为IOC容器中的bean对象
@Mapper
public interface UserMapper {
    /**
     * 返回的每一条数据都会封装到一个对象当中，这里就是User对象
     * 如果返回的是多条数据，那么就会封装到一个集合当中，这里就是List<User>集合
     */
    @Select("select * from user")
    public List<User> findAll();
}
