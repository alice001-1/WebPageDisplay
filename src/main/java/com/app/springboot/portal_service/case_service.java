package com.app.springboot.portal_service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.app.springboot.bean.case_bean;
import com.app.springboot.bean.patents_bean;

public interface case_service {
    public IPage<case_bean> select_case(Page page);
}
