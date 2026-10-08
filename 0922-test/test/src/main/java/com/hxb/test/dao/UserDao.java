package com.hxb.test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxb.test.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<User> {
    @Select("select * from user where username like concat('%', #{username}, '%')")
    List<User> selectByUsername(@Param("username") String username);

    @Select("select * from user where entry_date >= #{date}")
    List<User> selectByEntryDate(@Param("date") LocalDate date);
}
