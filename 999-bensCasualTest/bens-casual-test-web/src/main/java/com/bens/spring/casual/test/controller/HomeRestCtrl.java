package com.bens.spring.casual.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author wenming
 * @Date 2019/3/18 13:35
 **/
@RestController @RequestMapping("/rest/home")
public class HomeRestCtrl {

    @GetMapping("/menu")
    public Object menu() {

    }
}
