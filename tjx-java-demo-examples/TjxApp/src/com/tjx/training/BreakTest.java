package com.tjx.training;

public class BreakTest {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		for (char tmp = 'a'; tmp < 't'  ; tmp++) {
			
			if(tmp == 'k') {
				break;
			}
			System.out.println(tmp);
		}
		
		System.out.println("main ends");

	}

}
