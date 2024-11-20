package com.tjx.sales;

import java.util.Scanner;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter your name");
		
		String name = scanner.nextLine();
		System.out.println("name is: "+ name);
		
		System.out.println(name.length());
		
		System.out.println(name.toUpperCase());
		String storedName = "mounika";
		
		System.out.println(name.equals(storedName));
		
		String correctName =name.trim();
		System.out.println(name.equalsIgnoreCase(storedName));
		
		System.out.println(correctName.equals(storedName));
		
		System.out.println(name.charAt(3));
		
		
		System.out.println("main ends");

	}

}
