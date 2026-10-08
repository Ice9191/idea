package com.hxb.demo.demo04;

public class Test {
    /**
     * 数据库：DataBase，简称DB，是存储和管理数据的仓库
     * 数据库管理系统：DataBase Management System，简称DBMS，是用于操纵和管理数据库的大型软件
     * SQL：Structured Query Language，操作关系型数据库的编程语言，定义了一套操作关系型数据库统一的标准
     *
     * MySQL-企业开发使用方式：我的电脑想要访问远程的MySQL数据库
     *  指令：mysql -h远程数据库的ip地址 -P端口号 -u用户名 -p密码
     *  前面两个参数默认是：-hlocalhost -P3306
     *
     * MySQL数据模型：
     *  关系型数据库：建立在关系模型基础上，由多张相互连接的二维表组成的数据库
     *      特点：
     *          1. 使用表存储数据，格式统一，便于维护
     *          2. 使用SQL语言操作，标准统一，使用方便，可用于复杂查询
     *
     * SQL语句在操作数据库的时候，按照功能可以分为四类：
     *  1. DDL：Data Definition Language，数据定义语言，用于定义数据库结构（数据库，表，字段）（重点）
     *  2. DML：Data Manipulation Language，数据操作语言，用于对数据库表中的数据进行增、删、改（重点）
     *  3. DQL：Data Query Language，数据查询语言，用于查询数据库中表的记录（重点）
     *  4. DCL：Data Control Language，数据控制语言，用于创建数据库用户、控制数据库的访问权限
     */

    /**
     * DDL-数据库：
     *  show databases; --查询所有数据库
     *  select database(); --查询当前数据库
     *  use 数据库名; --使用/切换数据库
     *  create database [if not exists] 数据库名 [default charset utf8mb4]; --创建数据库
     *  drop database [if exists] 数据库名; --删除数据库
     *  注意：上述语法中的database，也可以替换成schema。比如：create schema mydb;MySQL8版本中，默认字符集是utf8mb4
     *
     * DDL-表结构-创建：
     *  create table 表名 (
     *      字段1名 数据类型 [约束] [comment '字段1的注释'],
     *      字段2名 数据类型 [约束] [comment '字段2的注释'],
     *      ...
     *      字段n名 数据类型 [约束] [comment '字段n的注释']
     *  ) [comment '表的注释'];
     *  约束：约束是作用于表中字段上的规则，用于限制存储在表中的数据
     *  目的：保证数据库中数据的正确性、有效性和完整性
     *
     * 常见的约束有：
     *  非空约束：限制该字段值不能为null，使用关键字not null
     *  唯一约束：保证字段的所有数据都是唯一、不重复的，使用关键字unique
     *  主键约束：主键是一行数据的唯一标识，要求非空且唯一，使用关键字primary key（一张表只能有一个主键）
     *  默认约束：保存数据时，如果未指定该字段值，则采用默认值，使用关键字default
     *  外键约束：让两张表的数据建立连接，保证数据的一致性和完整性，使用关键字foreign key
     *  auto_increment：自增，使用关键字auto_increment，要求该字段必须是主键
     *
     * DDL-表结构-查询、修改、删除：
     *  show tables; --查询当前数据库中所有表
     *  desc 表名; --查询表结构
     *  show create table 表名; --查询表的创建语句
     *  alter table 表名 add 字段名 类型（长度） [comment '字段注释'] [约束]; --添加字段
     *  alter table 表名 modify 字段名 新数据类型（长度）; --修改字段类型
     *  alter table 表名 change 旧字段名 新字段名 类型（长度） [comment '字段注释'] [约束]; --修改字段名和字段类型
     *  alter table 表名 drop column 字段名; --删除字段
     *  alter table 表名 rename to 新表名; --修改表名
     *  drop table [if exists] 表名; --删除表
     *  注意：删除表时，表中的数据也会被删除
     */

    /**
     * DML：Data Manipulation Language，数据操作语言，用于对数据库表中的数据进行增、删、改操作
     *  添加数据：insert
     *  修改数据：update
     *  删除数据：delete
     *
     * DML-insert：添加数据
     *  insert into 表名 (字段名1, 字段名2, ...) values (值1, 值2, ...); -- 指定字段添加数据
     *  insert into 表名 values (值1, 值2, ...); -- 全部字段添加数据
     *  insert into 表名 (字段名1, 字段名2, ...) values (值1, 值2, ...), (值1, 值2, ...); -- 批量添加数据（指定字段）
     *  insert into 表名 values (值1, 值2, ...), (值1, 值2, ...); -- 批量添加数据（全部字段）
     *  注意：
     *      1. 添加数据时，字段值的顺序必须与字段名的顺序一致
     *      2. 字符串和日期型数据应该包含在引号中（单引号、双引号都可以）
     *      3. 插入的数据大小/长度，应该在字段的规定范围内
     *
     * DML-update：
     *  update 表名 set 字段名1=值1, 字段名2=值2, ... [where 条件]; -- 修改数据
     *  注意：修改语句的条件可以有，也可以没有，如果没有条件，则会修改整张表的所有数据
     *
     * DML-delete：
     *  delete from 表名 [where 条件]; -- 删除数据
     *  注意：
     *      1. delete语句的条件可以有，也可以没有，如果没有条件，则会删除整张表的所有数据
     *      2. delete语句不能删除某一个字段的值（如果要操作，可以使用update语句，将该字段的值修改为null）
     */

    /**
     * DQL：Data Query Language，数据查询语言，用于查询数据库中表的记录，关键字select（用的最多）
     *  select -- 字段列表
     *  from -- 表名列表
     *  where -- 条件列表
     *  group by -- 分组字段列表
     *  having -- 分组后条件列表
     *  order by -- 排序字段列表
     *  limit -- 分页参数
     *
     * DQL-基本查询：
     *  select 字段1, 字段2, ... from 表名; -- 查询多个字段
     *  select * from 表名; -- 查询所有字段（通配符）
     *  select 字段1[as 别名1], 字段2[as 别名2], ... from 表名; -- 为查询字段设置别名，as关键字可以省略
     *  select distinct 字段列表 from 表名; -- 去除重复记录
     *  注意：*表示查询所有字段，在实际开发中尽量少用（不直观、影响效率）
     *
     * DQL-条件查询：
     *  select 字段列表 from 表名 where 条件列表; -- 条件查询
     *  条件列表：
     *      >：大于
     *      >=：大于等于
     *      <：小于
     *      <=：小于等于
     *      =：等于
     *      <>或!=：不等于
     *      between...and...：在某个范围内（含最小、最大值）
     *      in(...)：在in之后的列表中的值，多选一
     *      like 占位符：模糊匹配（_匹配单个字符，%匹配任意字符）
     *      is null：是null
     *      is not null：不是null
     *      and或&&：并且（多个条件同时成立）
     *      or或||：或者（多个条件任意一个成立）
     *      not或!：非，不是
     *
     * DQL-分组查询：分组通常会伴随聚合函数的使用
     *  聚合函数：将一列数据作为一个整体，进行纵向计算
     *      count()：统计数量
     *          1. count(字段)
     *          2. count(*)（优先推荐使用）
     *          3. count(常量)（推荐使用）
     *      max()：最大值
     *      min()：最小值
     *      avg()：平均值
     *      sum()：求和
     *      注意：所有聚合函数不参与null的统计
     *  select 字段列表 from 表名 [where 条件列表] group by 分组字段名 [having 分组后过滤条件]; -- 分组查询
     *      where与having的区别：
     *          1. 执行时机不同：where是分组之前进行过滤，不满足where条件，不参与分组；而having是分组之后对结果进行过滤
     *          2. 判断条件不同：where不能对聚合函数进行判断，而having可以
     *          注意：
     *              1. 分组之后，查询的字段一般为聚合函数和分组字段，查询其他字段无任何意义
     *              2. 执行顺序：where > 聚合函数 > having
     *
     * DQL-排序查询：
     *  select 字段列表 from 表名 [where 条件列表] [group by 分组字段名 having 分组后过滤条件] order by 排序字段 排序方式; -- 排序查询
     *      排序方式：asc（默认）升序，desc降序
     *      注意：如果是多字段排序，当第一个字段值相同时，才会根据第二个字段进行排序
     *
     * DQL-分页查询：
     *  select 字段 from 表名 [where 条件] [group by 分组字段 having 过滤条件] [order by 排序字段] limit 起始索引, 查询记录数; -- 排序查询
     *  注意：
     *      1. 起始索引从0开始
     *      2. 分页查询是数据库的方言，不同的数据库有不同的实现，MySQL是limit
     *      3. 如果起始索引为0，起始索引可以省略，直接简写为limit 10
     *      4. 起始索引 = (页码 - 1) * 每页展示记录数
     */
}
