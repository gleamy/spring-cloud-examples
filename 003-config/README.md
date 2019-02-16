# spring-cloud-examples

## 基本配置

注册中心 -> 配置中心 -> 应用层 测试通过。

重点关注应用层的 bootstrap.yml 的配置文件，他的加载时间比较早，因此关于配置的内容需要写到这里面。

## 增加配置刷新功能

> 只需操作 应用层项目（config-client）即可

- 在项目中引入 spring-boot-starter-actuator， 如下：
```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
- 在需要刷新配置的对象上添加注解 @RefreshScope 
- springboot 1.5.X 以上默认开通了安全认证，所以需要在配置文件application.properties添加 management.security.enabled=false