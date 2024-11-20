package com.tjx.demos;

import java.util.Scanner;

public class OperatorsDemo {

	public static void main(String[] args) {
		System.out.println("main begins");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter name");
		
		String name = scan.next();
		
		
		System.out.println(name.toUpperCase());
		
		name = null;
		System.out.println(name.toLowerCase());
		
//		System.out.println("number1:");
//		//int number1 = scan.nextInt();
//		
//		double number1 = scan.nextDouble();
//		System.out.println("number2:");
//		//int number2 = scan.nextInt();
//		
//		double number2 = scan.nextDouble();
//		
//		//The literal 11311311211 of type int is out of range 
//		//int x= 11311311211;
//		
//		//int sum = number1 + number2;
//		
//		System.out.println(number1%number2);
		
		System.out.println("main ends");

	}

}
