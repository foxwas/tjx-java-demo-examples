package com.tjx.training;

public class DepartmentApp {

	public static void main(String[] args) {
		
		Department salesDepartemnt =new Department();
		
		Department trainingDepartment = new Department("training");
		
		Department storeManagementDepartment = new Department("storemanagenent", 12);
		
		Department financeDepartment = new Department("finance", 10, new Account(null, null, null, null));
		
	}

}
