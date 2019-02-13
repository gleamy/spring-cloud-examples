package com.bens.spring.cloud.examples.service.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author wenming
 * @Date 2019/2/13 14:15
 **/
@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping(value = "/hello")
    public String hello() {
        return myService.helloService();
    }
}
