package com.tjx.training;

public class ContinueTest {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		for (char tmp = 'a'; tmp < 't'  ; tmp++) {
			
			if(tmp == 'k' || tmp =='o') {
				continue;
			}
			System.out.println(tmp);
		}
		
		System.out.println("main ends");

	}

}
