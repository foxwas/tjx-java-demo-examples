package com.tjx.training;

public class NestedLoopTest {

	public static void main(String[] args) {
		System.out.println("main begins");
		
	loop1:	for (int i = 0; i < 4; i++) {
			System.out.println(" loop1: " + i);
			loop:	for (int j = 0; j <3; j++) {
				
				System.out.println("loop2:  " + j);
				loop3:		for (int j2 = 0; j2 < 2; j2++) {
					System.out.println("loop3 :" + j2);
				}
			}
			
		}
	}

}
