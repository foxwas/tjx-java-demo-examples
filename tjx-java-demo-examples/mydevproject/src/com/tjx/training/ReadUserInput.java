package com.tjx.training;

import java.util.Scanner;

public class ReadUserInput {

	public static void main(String[] args) {

		System.out.println("main begins");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter your name:");
		
		//String userName = scanner.next();
		
		String userName = scanner.nextLine();
		System.out.println("you entered: " + userName);
		
		System.out.println("enter your age:");
		
		int age = scanner.nextInt();
		
		System.out.println("your age: " + age);
		System.out.println("main ends");

	}

}
