package com.tjx.training;

public class LoopTest {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		int age = 21;
		
//		while(age <25) {
//			System.out.println("sorry you cannot rent");
//			age++;
//		}
//		
		
		do {
			System.out.println("you have to be 25 to rent");
			age++;
		} while (age<25);
//		for (int i =0; i <= 10; i++) {
//			System.out.println(i);
//		}
		
//		for(;;) {
//			System.out.println("running for loop");
//		}
		System.out.println("main ends");
	}

}
