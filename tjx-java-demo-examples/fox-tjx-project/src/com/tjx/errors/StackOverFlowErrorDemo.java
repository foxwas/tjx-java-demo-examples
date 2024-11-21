package com.tjx.errors;

public class StackOverFlowErrorDemo {

	public static void main(String[] args) {
		int count =1;
		System.out.println("main begins " + count++);
		
		main(args);
		

	}

}
