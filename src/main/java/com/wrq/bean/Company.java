package com.wrq.bean;

import java.util.Date;

public class Company {
	private Integer id;
	private String name;
	private Date  time;
	private MoneyType moneyType;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public MoneyType getMoneyType() {
		return moneyType;
	}
	public void setMoneyType(MoneyType moneyType) {
		this.moneyType = moneyType;
	}
	public Company(Integer id, String name, Date time, MoneyType moneyType) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.moneyType = moneyType;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
