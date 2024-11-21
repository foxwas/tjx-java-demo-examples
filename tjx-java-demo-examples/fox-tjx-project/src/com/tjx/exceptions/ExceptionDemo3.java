package com.tjx.exceptions;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter your id: ");
		
		int id = scanner.nextInt();
		try {
			System.out.println("try block begins");
			if( id <=0) {
				throw new Exception("invalid id");
			}
			System.out.println("try block ends");
		} catch (Exception e) {
			System.out.println("inside catch block");
			e.printStackTrace();
		}
		finally {
			System.out.println("inside finally block -- closing resources");
		}
		
		System.out.println("main ends");

	}

}
