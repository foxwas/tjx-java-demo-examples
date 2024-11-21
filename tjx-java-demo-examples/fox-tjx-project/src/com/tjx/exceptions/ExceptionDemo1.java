package com.tjx.exceptions;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("main begins");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter your id: ");
		
		int id = scanner.nextInt();
		if( id <=0) {
			throw new Exception("invalid id");
		}
		
		System.out.println("main ends");

	}

}
