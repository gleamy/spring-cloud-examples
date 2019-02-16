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
- 配置 actuator 的配置刷新功能 

  由于springboot 2.x的actuator的改进比较大，通过在配置文件application.properties添加management.security.enabled=false来关闭安全限制已经不可用了，因此需要其他的配置方式。
  
  具体的配置如下：
  ```yaml
  info:
    head: head
    body: body
  management:
    endpoints:
      web:
        exposure:
          #加载所有的端点，默认只加载了info、health
          include: '*'
    endpoint:
      refresh:
        enabled: true
      health:
        show-details: always
      #可以关闭指定的端点
      shutdown:
        enabled: false
  ```
- 最后在应用层项目中测试时，请用post形式访问接口 http://localhost:8002/refresh，（curl -X POST http://localhost:8002/refresh），
这时我们在访问 http://localhost:8095/hello-config 就会发现配置的数据已经变更了。