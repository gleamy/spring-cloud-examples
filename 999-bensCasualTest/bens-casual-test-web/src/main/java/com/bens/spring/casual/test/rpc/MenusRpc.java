package com.bens.spring.casual.test.rpc;

import com.bens.spring.casual.test.controller.param.MenusRsp;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Description
 * @Author wenming
 * @Date 2019/3/18 19:57
 **/
@Component
public class MenusRpc {

    /**
     * 载入菜单
     * @return
     */
    public MenusRsp[] loadMenusRpc() {
        return new MenusRsp[] {
                MenusRsp.builder().id(1).text("生产管理").build(),
                MenusRsp.builder().id(2).text("采购管理").build(),
                MenusRsp.builder().id(3).text("销售管理").build(),
                MenusRsp.builder().id(4).text("库存管理").build(),
                MenusRsp.builder().id(5).text("配送管理").children(Arrays.asList(new MenusRsp[] {
                        MenusRsp.builder().id(6).text("车辆管理").build(),
                        MenusRsp.builder().id(7).text("分拣管理").build()
                })).build()
        };
    }
}
