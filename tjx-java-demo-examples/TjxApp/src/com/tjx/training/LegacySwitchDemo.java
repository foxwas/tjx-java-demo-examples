package com.tjx.training;

import java.util.Scanner;

public class LegacySwitchDemo {

	public static void main(String[] args) {
		System.out.println("main begins");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your airline choice to fly?");
		String airline = scanner.next();
		
		switch (airline) {
			case "AA":
				System.out.println("call AA API to book ticket");
			//break;
			case "Delta":
				System.out.println("call Delta API to book ticket");
			//break;
			case "United":
				System.out.println("call United API to book ticket");
			//break;
			default:
				System.out.println("invalid airline to book a ticket");
			break;
		}
		
		System.out.println("main ends");
		scanner.close();

	}

}
