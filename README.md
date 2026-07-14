# 企业网页展示样例

基于 Spring Boot + Vue3 + ElementPlus 构建的企业门户网站系统。

## 技术栈

| 分类 | 技术 | 版本 |
| :--- | :--- | :--- |
| 后端框架 | Spring Boot | 2.4.3 |
| ORM框架 | MyBatis Plus | 3.4.2 |
| 权限框架 | Apache Shiro | 1.5.3 |
| 模板引擎 | Thymeleaf | 3.0.12 |
| 数据库 | MySQL | 5.1.49 |
| 前端框架 | Vue | 3.x |
| UI组件库 | Element Plus | 2.5.0 |
| 构建工具 | Maven | 3.6+ |

## 功能特性

- **企业门户展示**：产品展示、解决方案、专利荣誉、成功案例
- **后台管理系统**：基于 Layui Mini 的管理后台
- **用户认证**：基于 Shiro 的用户登录认证与权限管理
- **图片管理**：支持产品、案例等图片上传与展示
- **轮播图管理**：首页轮播图的动态配置

## 项目结构

```
portal-website-system/
├── src/
│   ├── main/
│   │   ├── java/com/wuhao/wuhaozn_springboot/
│   │   │   ├── bean/          # 实体类
│   │   │   ├── config/        # 配置类（Shiro、MyBatis Plus等）
│   │   │   ├── control/       # 控制器（后台管理）
│   │   │   ├── portal_control/ # 控制器（前台门户）
│   │   │   ├── mapper/        # MyBatis Mapper（后台）
│   │   │   ├── protal_mapper/ # MyBatis Mapper（前台）
│   │   │   ├── server/        # 服务层（后台）
│   │   │   ├── portal_service/# 服务层（前台）
│   │   │   ├── shiro/         # Shiro Realm配置
│   │   │   ├── util/          # 工具类
│   │   │   └── WuhaoznSpringbootApplication.java
│   │   └── resources/
│   │       ├── static/        # 静态资源（CSS、JS、图片）
│   │       ├── templates/     # Thymeleaf模板文件
│   │       └── application.yaml # 应用配置
├── lib/                       # 本地依赖库
├── pom.xml                    # Maven配置
└── kxj_database.sql           # 数据库初始化脚本
```

## 快速开始

### 环境要求

- JDK 1.8+
- Maven 3.6+
- MySQL 5.5+

### 安装步骤

1. **克隆项目**

```bash
git clone <repository-url>
cd portal-website-system
```

2. **创建数据库**

```sql
CREATE DATABASE IF NOT EXISTS sgpd DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
```

3. **导入数据**

```bash
mysql -u root -p sgpd < kxj_database.sql
```

4. **配置数据库连接**

编辑 `src/main/resources/application.yaml`：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/sgpd?useUnicode=true&characterEncoding=utf8
    username: root
    password: 123456
```

5. **启动应用**

```bash
mvn spring-boot:run
```

6. **访问地址**

- 前台门户：http://localhost:8181/
- 后台管理：http://localhost:8181/login

### 登录账号

| 用户名 | 密码 | 角色 |
| :--- | :--- | :--- |
| admin | 123 | 管理员 |
