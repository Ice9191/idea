package com.hxb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 实体类User，通常放在pojo包下，或者entity包下
 * 用于封装用户信息
 */
@Data // 自动会所有成员变量生成get和set方法
@NoArgsConstructor // 自动生成无参构造方法
@AllArgsConstructor // 自动生成全参构造方法
public class User {
    private Integer id; // 使用包装类，因为基本数据类型的int会有默认值，无法区分
    private String username;
    private String password;
    private String name;
    private Integer age;
    private LocalDateTime updateTime;
}
