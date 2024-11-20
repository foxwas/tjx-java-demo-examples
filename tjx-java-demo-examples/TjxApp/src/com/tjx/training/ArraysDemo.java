package com.tjx.training;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		System.out.println("main begins");
//		
//		int[] units = new int[4];
//		units[0] = 100;
//		units[1]= 200;
//		units[2] = 300;
//		
//		
//		System.out.println(units.length);
//		System.out.println(units[0]);
//		System.out.println(units[1]);
//		System.out.println(units[2]);
//		System.out.println(units[3]);
//		//System.out.println(units[4]);
		
		
		int[] studentNumbers = { 41, -21, 31, 410};
//		for (int i = 0; i < studentNumbers.length; i++) {
//			System.out.println(studentNumbers[i]);
//		}
		
		for (int i : studentNumbers) {
			System.out.println(i);
		}
		Arrays.sort(studentNumbers);
		
		System.out.println("after sorting");
//		for (int i = 0; i < studentNumbers.length; i++) {
//			System.out.println(studentNumbers[i]);
//		}
		
		for (int i : studentNumbers) {
			System.out.println(i);
		}
		
		String[] studentNames = {"christina", "mohan", "sirisha", "saravanan"};
//		for (int i = 0; i < studentNames.length; i++) {
//			System.out.println(studentNames[i]);
//		}
		
		for (String name : studentNames) {
			System.out.println(name);
		}
		
		
		Arrays.sort(studentNames);
		
		System.out.println("after sorting");
		
		for (String name : studentNames) {
			System.out.println(name);
		}
		
		
		System.out.println("main ends");
	}

}
