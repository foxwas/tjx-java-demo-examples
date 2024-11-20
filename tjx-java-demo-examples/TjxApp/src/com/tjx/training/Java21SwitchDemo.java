package com.tjx.training;

import java.util.Scanner;

public class Java21SwitchDemo {

	public static void main(String[] args) {
System.out.println("main begins");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what day of the week number?");
		int dayOfWeek = scanner.nextInt();
		
		String dayName = switch (dayOfWeek) {
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			default -> "Unknown";
			
		};
		
		System.out.println("the day is: " + dayName);
		
		System.out.println("main ends");
		scanner.close();
	}

}
