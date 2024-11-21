package com.tjx.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionsDemo {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/fox/fox.txt"));
			String data = br.readLine();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main ends");
	}

}
