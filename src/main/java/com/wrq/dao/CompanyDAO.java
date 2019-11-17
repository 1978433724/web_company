package com.wrq.dao;

import java.util.List;
import java.util.Map;

import com.wrq.bean.Company;

public interface CompanyDAO {

	int addCompany(Company company);

	List list(Map map);

	Map getCompanyInfo(Integer id);

	
	
}
