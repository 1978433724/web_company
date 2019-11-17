package com.wrq.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wrq.bean.Company;
import com.wrq.dao.CompanyDAO;

@Service
public class CompanyServiceImpl implements ComanyService {
	@Resource
	private CompanyDAO companyDAO;
	@Override
	public int addCompany(Company company) {
		// TODO Auto-generated method stub
		return companyDAO.addCompany(company);
	}
	@Override
	public List list(Map map) {
		// TODO Auto-generated method stub
		return companyDAO.list(map);
	}
	@Override
	public Map getCompanyInfo(Integer id) {
		// TODO Auto-generated method stub
		return companyDAO.getCompanyInfo(id);
	}

}
