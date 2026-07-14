package com.app.springboot.portal_service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.app.springboot.bean.product_bean;

public interface product_service {

    public IPage<product_bean> select_product(Page page);
}
