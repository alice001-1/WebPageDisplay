package com.app.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.shiro.spring.boot.autoconfigure.ShiroAutoConfiguration;
import org.apache.shiro.spring.boot.autoconfigure.ShiroAnnotationProcessorAutoConfiguration;

@SpringBootApplication(exclude = {ShiroAutoConfiguration.class, ShiroAnnotationProcessorAutoConfiguration.class})
@MapperScan({"com.app.springboot.mapper","com.app.springboot.protal_mapper"})
public class AppSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppSpringbootApplication.class, args);
    }

}


