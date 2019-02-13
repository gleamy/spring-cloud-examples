# spring-cloud-examples

> - eureka-client 和 eureka-server 没有调通
> - eureka-client2 和 eureka-server2 测试通过，但是在Server面板中点击 SERVER-CLIENT2 的Status时， http://localhost:8092/actuator/info 路径不存在。

## 关键点

- server 端引入 spring-cloud-starter-netflix-eureka-server
- client 端引入 spring-cloud-starter-netflix-eureka-client
- server 和 client 必须通过spring.application.name 进行命名
- server 通过eureka.client.registerWithEureka:false和fetchRegistry:false来表明自己是一个eureka server.
- 在入口类上必须添加注解， server 端添加 @EnableEurekaServer; client 端添加 @EnableEurekaClient;