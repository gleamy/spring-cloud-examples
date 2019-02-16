package com.bens.spring.cloud.examples.config.test.registration.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ConfigTestRegistrationCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigTestRegistrationCenterApplication.class, args);
    }

}

