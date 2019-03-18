package com.bens.spring.casual.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author wenming
 * @Date 2019/3/18 13:35
 **/
@Controller @RequestMapping("/home")
public class HomeCtrl {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
