# spring-boot-sample-flyway
## 技术点

[参考](http://blog.didispace.com/spring-boot-flyway-db-version/)

[官网](https://flywaydb.org/)

### 1. Spring Boot
### 2. Mybatis-plus
### 3. Mysql
### 4. flyway 数据库版本管理
### 5. CompletableFuture

   	1. supplyAsync
   	2. completeAsync
   	3. thenApply
   	4. whenCompleteAsync

### 6. @Async

### 7. ListenableFuture

```
result.addCallback(success -> {
            saveUser(user);
        }, fail -> {
            asyncServiceImpl.saveWithListenableResult(auditLog);
        })
```

### 7. akka [参考](https://zhuanlan.zhihu.com/p/43151192)

### 8. [Spring Boot 并发数据聚合库](https://github.com/wuxinshui/spring-boot-data-aggregator)


CompletableFuture.supplyAsync()

1.包含FeignClient请求不用