package com.app.springboot.portal_service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.app.springboot.bean.patents_bean;


public interface patnet_service {
    public IPage<patents_bean> select_patent(Page page);
}
