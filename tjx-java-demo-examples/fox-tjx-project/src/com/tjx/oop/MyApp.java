package com.tjx.oop;

public class MyApp {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		Customer customer1 = new Customer("sirisha", 1L, "sirisha@tjx.com");
		
		System.out.println(customer1);
		
		Object object1 = customer1;		//upcast ;  subtyoe object cast into super type
		
		Object object2 = new Customer("christina", 2L, "christina@tjx.com"); //upcast
		
		Customer c1 = (Customer) object1;
		
		Customer currentCustomer = (Customer) object2;  //downcast ; super type object cast into sub type
		
		Object obj3 = new Object();
		System.out.println(object1 instanceof Customer);
		System.out.println( obj3 instanceof Customer);
		
		if( obj3 instanceof Customer) {
			Customer c3 = (Customer) obj3;
		}
		System.out.println("main ends");

	}

}
