package com.app.springboot;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.app.springboot.bean.product_bean;
import com.app.springboot.server.product_service;
import com.app.springboot.util.AuthCode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@SpringBootTest
@Slf4j
class AppSpringbootApplicationTests {
    @Autowired
    product_service productService;
    @Test
    void contextLoads() throws IOException {
        Page<product_bean> page = new Page<>(2,5);
       IPage<product_bean> iPage= productService.select_product(page);

       System.out.println(iPage.getRecords());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getPages());
        System.out.println(iPage.getTotal());


    }

}