package com.tjx.training;

public class AccountApp {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		Account mohanAccount = new Account("kumaran Mohan", 1L);
		
		Account sirishaAccount = new Account("sirisha", 2L);
		
		Account customerAccount = new Account("sirisha", 2L);
		
		System.out.println(sirishaAccount == customerAccount);
		
		System.out.println(sirishaAccount.equals(customerAccount));
		
		System.out.println(mohanAccount.toString());
		System.out.println(mohanAccount);
		System.out.println("main ends");

	}

}
