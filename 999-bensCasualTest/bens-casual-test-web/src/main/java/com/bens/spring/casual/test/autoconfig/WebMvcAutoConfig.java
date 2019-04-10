package com.bens.spring.casual.test.autoconfig;

import com.bens.spring.casual.test.support.AccessInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description
 * @Author wenming
 * @Date 2019/3/19 9:32
 **/
@Configuration
public class WebMvcAutoConfig implements WebMvcConfigurer {

    @Bean
    public AccessInterceptor accessInterceptor(){
        return new AccessInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessInterceptor());
    }
}
