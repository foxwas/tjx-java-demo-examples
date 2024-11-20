package com.tjx.customerservice;

public class SilverCustomer extends Customer {
	
	private Double silverDiscount;
	
	
	public SilverCustomer(String customerName, Long customerId, String customerEmail) {
		super(customerName, customerId, customerEmail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printCustomerProfile() {
		System.out.println("sorry, you need customer permission to print profile");
	
	}
	
	public void shareCustomerData(boolean isPermitted) {
		
		if(isPermitted) {
			
			super.printCustomerProfile();
			
		}
		else {
			this.printCustomerProfile();
		}
	}

}
