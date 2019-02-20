package com.bens.spring.cloud.examples.admin.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdminEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminEurekaServerApplication.class, args);
    }

}
