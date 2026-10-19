package com.hxb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 实体类当中的属性要与数据库表当中的字段对应起来
     */
    // 使用包装类型，因为基本数据类型是有默认值的，可能会和数据库中的值冲突
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
}
