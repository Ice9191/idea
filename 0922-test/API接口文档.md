# 用户模块接口文档（user）

| 项目 | 说明 |
| --- | --- |
| 工程名称 | test（`com.hxb:test:0.0.1-SNAPSHOT`） |
| 框架 | Spring Boot 4.1.0 + MyBatis-Plus 3.5.16 + MySQL |
| JDK | 17 |
| 基础路径 | `http://localhost:8080`（`application.yml` 未配置 `server.port` 与 `context-path`，使用默认值） |
| 请求/响应格式 | `application/json;charset=UTF-8` |
| Controller | `com.hxb.test.controller.UserController` |
| 更新时间 | 2026-09-23 |

---

## 一、通用说明

1. 所有接口均以 `/user` 为前缀。
2. 请求体为 JSON，字段名与实体 `User` 的属性名保持一致（驼峰命名）。
3. `id`、`createTime`、`updateTime` 由数据库/框架自动维护：
   - `id`：主键自增（`IdType.AUTO`），新增时无需传入；
   - `createTime`：插入时由 `MyMetaObjectHandler` 自动填充为当前时间；
   - `updateTime`：插入和更新时自动填充为当前时间。
4. `createTime`、`updateTime` 响应格式为 `yyyy-MM-dd HH:mm:ss`（GMT+8）。
5. `entryDate` 为日期类型，传参格式建议 `yyyy-MM-dd`。
6. 当前接口**未做统一响应封装**，直接返回业务数据（新增返回 `boolean`，列表返回 `User` 数组）。

---

## 二、数据模型：User

对应数据库表：`user`

| 字段 | 类型 | 必填 | 说明 |
| --- | --- | --- | --- |
| id | Integer | 否 | 主键，自增 |
| username | String | 是 | 用户名（登录账号） |
| name | String | 是 | 姓名 |
| age | Integer | 否 | 年龄 |
| gender | String | 否 | 性别 |
| phone | String | 否 | 手机号 |
| job | Integer | 否 | 职位（枚举/字典值） |
| salary | Integer | 否 | 薪资 |
| entryDate | LocalDate | 否 | 入职日期，格式 `yyyy-MM-dd` |
| image | String | 否 | 头像地址 |
| createTime | LocalDateTime | 否 | 创建时间，自动填充 |
| updateTime | LocalDateTime | 否 | 更新时间，自动填充 |

**JSON 示例**

```json
{
  "id": 1,
  "username": "zhangsan",
  "name": "张三",
  "age": 25,
  "gender": "男",
  "phone": "13800138000",
  "job": 1,
  "salary": 12000,
  "entryDate": "2026-09-01",
  "image": "https://example.com/avatar/1.png",
  "createTime": "2026-09-23 10:15:30",
  "updateTime": "2026-09-23 10:15:30"
}
```

---

## 三、接口列表

| 编号 | 接口名称 | 方法 | 路径 | 说明 |
| --- | --- | --- | --- | --- |
| 1 | 新增用户 | POST | `/user/add` | 新增一条用户记录，返回是否成功 |
| 2 | 查询用户列表 | GET | `/user/list` | 查询全部用户，无分页 |

---

## 四、接口详情

### 4.1 新增用户

- **请求方式**：`POST`
- **请求路径**：`/user/add`
- **Content-Type**：`application/json`
- **Controller 方法**：`UserController#add(User)`

**请求参数（Body）**

| 字段 | 类型 | 必填 | 说明 |
| --- | --- | --- | --- |
| username | String | 是 | 用户名 |
| name | String | 是 | 姓名 |
| age | Integer | 否 | 年龄 |
| gender | String | 否 | 性别 |
| phone | String | 否 | 手机号 |
| job | Integer | 否 | 职位 |
| salary | Integer | 否 | 薪资 |
| entryDate | String | 否 | 入职日期，`yyyy-MM-dd` |
| image | String | 否 | 头像地址 |

> `id`、`createTime`、`updateTime` 无需传入，由系统自动生成。

**请求示例**

```json
{
  "username": "zhangsan",
  "name": "张三",
  "age": 25,
  "gender": "男",
  "phone": "13800138000",
  "job": 1,
  "salary": 12000,
  "entryDate": "2026-09-01",
  "image": "https://example.com/avatar/1.png"
}
```

**响应参数**

| 类型 | 说明 |
| --- | --- |
| boolean | `true` 新增成功；`false` 新增失败 |

**响应示例**

```json
true
```

**cURL 示例**

```bash
curl -X POST http://localhost:8080/user/add \
  -H "Content-Type: application/json" \
  -d '{
    "username": "zhangsan",
    "name": "张三",
    "age": 25,
    "gender": "男",
    "phone": "13800138000",
    "job": 1,
    "salary": 12000,
    "entryDate": "2026-09-01",
    "image": "https://example.com/avatar/1.png"
  }'
```

---

### 4.2 查询用户列表

- **请求方式**：`GET`
- **请求路径**：`/user/list`
- **Controller 方法**：`UserController#list()`

**请求参数**

无。

**响应参数**

`User` 对象数组，字段见 [数据模型](#二数据模型user)。

**响应示例**

```json
[
  {
    "id": 1,
    "username": "zhangsan",
    "name": "张三",
    "age": 25,
    "gender": "男",
    "phone": "13800138000",
    "job": 1,
    "salary": 12000,
    "entryDate": "2026-09-01",
    "image": "https://example.com/avatar/1.png",
    "createTime": "2026-09-23 10:15:30",
    "updateTime": "2026-09-23 10:15:30"
  },
  {
    "id": 2,
    "username": "lisi",
    "name": "李四",
    "age": 28,
    "gender": "女",
    "phone": "13900139000",
    "job": 2,
    "salary": 15000,
    "entryDate": "2026-08-15",
    "image": null,
    "createTime": "2026-09-23 10:20:11",
    "updateTime": "2026-09-23 10:20:11"
  }
]
```

**cURL 示例**

```bash
curl -X GET http://localhost:8080/user/list
```

---

## 五、环境与配置

数据源配置（`src/main/resources/application.yml`）：

```yaml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/dbTest?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai
    username: root
    password: Test@123456
```

启动类：`com.hxb.test.TestApplication`，运行后默认监听 `8080` 端口。