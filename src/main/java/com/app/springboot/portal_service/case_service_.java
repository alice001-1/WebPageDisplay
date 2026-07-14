package com.app.springboot.portal_service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.app.springboot.bean.case_bean;
import com.app.springboot.protal_mapper.cases_mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class case_service_ implements case_service {
    @Autowired
    cases_mapper casesMapper;

    @Override
    public IPage<case_bean> select_case(Page page) {

        return casesMapper.select_case(page);
    }
}
