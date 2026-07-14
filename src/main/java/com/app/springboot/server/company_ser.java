package com.app.springboot.server;

import com.app.springboot.bean.company_information;

public interface company_ser {

    public company_information select_company();
    public  boolean update_company(company_information companyInformation);
    public company_information select_company_gy(int id);

}
