## crud-model一些个人习惯封装
## crud基本model
一些crud以及分页都已封装，sql除外。
- BaseEntity
- BaseMapper
- BaseService
- BaseController

### 状态码
- HttpCode

### 工具类
- DateUtil
- IdGenUtil：雪花算法以及UUID
- PageUtil：

### 封装返回结果
- ResultVo

## 如何使用？
添加Maven依赖：
```
<dependencies>
    <dependency>
        <groupId>com.lzhpo</groupId>
        <artifactId>lzhpo-crud-model</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
</dependencies>

<repositories>
    <repository>
        <id>maven-repository-example</id>
        <!-- 格式是 https://raw.githubusercontent.com/[github 用户名]/[github 仓库名]/[分支名]/repository -->
        <url>https://raw.githubusercontent.com/lzhpo/lzhpo-crud-model/master/repository</url>
    </repository>
</repositories>
```