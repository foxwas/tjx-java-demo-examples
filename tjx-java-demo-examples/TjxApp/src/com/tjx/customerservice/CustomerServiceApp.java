package com.tjx.customerservice;

public class CustomerServiceApp {

	public static void main(String[] args) {
		Customer c1 = new Customer("kumaran", 1L, "kumaran@tjx.com");
		
		c1.printCustomerProfile();
		
		SilverCustomer s1 = new SilverCustomer("fox", 2L,  "fox@fox.com");
		s1.printCustomerProfile();
		
		s1.shareCustomerData(true);

	}

}
