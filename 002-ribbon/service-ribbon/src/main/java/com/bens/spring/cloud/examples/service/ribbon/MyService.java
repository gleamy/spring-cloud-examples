package com.bens.spring.cloud.examples.service.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author wenming
 * @Date 2019/2/13 13:43
 **/
@Service
public class MyService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService() {
        return restTemplate.getForObject("http://SERVICE-CLIENT2/hello", String.class);
    }
}
