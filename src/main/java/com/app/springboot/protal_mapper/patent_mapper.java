package com.app.springboot.protal_mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.app.springboot.bean.patents_bean;
import com.app.springboot.bean.product_bean;
import org.apache.ibatis.annotations.Select;

public interface patent_mapper {

    @Select("select * from patents_table")
    public IPage<patents_bean> select_patent(Page page);
}
