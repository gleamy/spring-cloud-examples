package com.bens.spring.casual.test.controller;

import com.bens.spring.casual.test.rpc.MenusRpc;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private MenusRpc menusRpc;

    @GetMapping("/menu")
    public Object menu() {
        return menusRpc.loadMenusRpc();
    }
}
