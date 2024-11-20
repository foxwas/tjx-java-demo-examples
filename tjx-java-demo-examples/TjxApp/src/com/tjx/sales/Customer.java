package com.tjx.sales;

public class Customer {
	
	String customerName;
	long customerId;
	String customerEmail;
	String customerPhoneNumber;
	
	
	

	public Customer(String customerName, long customerId, String customerEmail, String customerPhoneNumber) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	//special method to initialize fields
	
	
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}





	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}





	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}





	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}





	public void printCustomerData() {
		System.out.println("Name:  " + customerName);
		System.out.println("Id: " + customerId);
		System.out.println("Email: " + customerEmail);
		
		System.out.println("Phone: " + customerPhoneNumber);
	}

}
