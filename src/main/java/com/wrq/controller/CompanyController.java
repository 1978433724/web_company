package com.wrq.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wrq.bean.Company;
import com.wrq.service.ComanyService;

@Controller
public class CompanyController {

	@Resource
	private ComanyService companyService;
	@RequestMapping("list.do")
	public String list(Model model,@RequestParam(value="cpage",defaultValue="1")Integer cpage,
			String mohu1,String mohu2,String mohu3) {
		Map map=new HashMap();
		map.put("mohu1", mohu1);
		map.put("mohu2", mohu2);
		map.put("mohu3", mohu3);
		PageHelper.startPage(cpage,10);
		List list=companyService.list(map);
		PageInfo pi=new PageInfo(list);
		model.addAttribute("list", list);
		model.addAttribute("pi", pi);
		model.addAttribute("map", map);
		
		return "list";
	}
	
	@RequestMapping("/getCompanyInfo.do")
	public String getCompanyInfo(Integer id,Model model) {
		Map company=companyService.getCompanyInfo(id);
		model.addAttribute("company", company);
		return "info";
	}
	
}
