package com.bens.spring.casual.test.controller.param;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * 菜单
 *
 * @Description
 * @Author wenming
 * @Date 2019/3/18 15:14
 **/
@Data
public class MenusRsp {

    private Integer id;

    private String text;

    private List<MenusRsp> children = new LinkedList<>();
}