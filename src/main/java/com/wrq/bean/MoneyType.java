package com.wrq.bean;

public class MoneyType {
	private Integer id;
	private String name;
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
	@Override
	public String toString() {
		return "MoneyType [id=" + id + ", name=" + name + "]";
	}
	public MoneyType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MoneyType(Integer id) {
		super();
		this.id = id;
	}
	
	

}
