package com.tjx.customerservice;

public class Customer {
	
	private String customerName;
	private Long customerId;
	private String customerEmail;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, Long customerId, String customerEmail) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	public void printCustomerProfile() {
		System.out.println("Customer Profile:");
		System.out.println(this.customerName + "\n" + this.customerEmail + "\n");
	}

}
