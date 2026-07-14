package com.app.springboot.portal_service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.app.springboot.bean.solution_bean;

public interface solution_service {
    public IPage<solution_bean> select_solution(Page page);
}
