package com.hxb.dao;

import java.util.List;

/**
 * 统一的UserDao接口
 */
public interface UserDao {

    // 加载用户数据
    List<String> findAll();

}
