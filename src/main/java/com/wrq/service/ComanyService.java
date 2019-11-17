package com.wrq.service;

import java.util.List;
import java.util.Map;

import com.wrq.bean.Company;

public interface ComanyService {

	int addCompany(Company company);

	List list(Map map);

	Map getCompanyInfo(Integer id);

}
