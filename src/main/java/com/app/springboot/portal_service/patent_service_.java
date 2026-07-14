package com.app.springboot.portal_service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.app.springboot.bean.patents_bean;
import com.app.springboot.protal_mapper.patent_mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class patent_service_ implements patnet_service {
    @Autowired
    patent_mapper patentMapper;


    @Override
    public IPage<patents_bean> select_patent(Page page) {
        return   patentMapper.select_patent(page);
    }
}
