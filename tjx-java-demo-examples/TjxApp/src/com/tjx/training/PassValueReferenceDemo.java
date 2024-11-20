package com.tjx.training;

public class PassValueReferenceDemo {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		int age = 24;
		
		System.out.println(age);  //pass a copy of the value of age
		
		String name = "christina";
		
		System.out.println(name.toUpperCase()); //pass a copy of the reference name
		
		System.out.println("main ends");

	}

}
