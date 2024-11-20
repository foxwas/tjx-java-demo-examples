package com.tjx.sales;

public class CustomerServiceApp {

	public static void main(String[] args) {
		
		
		Customer mark = new Customer("Mark", 12234111L, "mark@tjx.com","313-245-5671" );
	

		
		mark.printCustomerData();
		
		System.out.println();
		
		Customer elias = new Customer("elias",23134111L,"elias@tjx.com", "512-245-5671"  );
		

		
		elias.printCustomerData();
		
		mark = null;
		
		if(mark != null) {
				mark.printCustomerData();
		}
		//System.out.println(mark);
		
		//System.out.println(elias);

	}

}
