package com.tjx.training;
//this represents different department in tjx


public class Department {
	
	private String departmentName;
	private Integer departmentId;
	private Account departmentAcccount;
	

	public Department() {
		// TODO Auto-generated constructor stub
	}


	public Department(String departmentName) {
		super();		//calls super class default no args constructor
		this.departmentName = departmentName;
	}


	public Department(String departmentName, Integer departmentId) {
		this(departmentName, departmentId, null);
//		super();
//		this.departmentName = departmentName;
//		this.departmentId = departmentId;
	}


	public Department(String departmentName, Integer departmentId, Account departmentAcccount) {
		super();
		this.departmentName = departmentName;
		this.departmentId = departmentId;
		this.departmentAcccount = departmentAcccount;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public Integer getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}


	public Account getDepartmentAcccount() {
		return departmentAcccount;
	}


	public void setDepartmentAcccount(Account departmentAcccount) {
		this.departmentAcccount = departmentAcccount;
	}
	
	

}
