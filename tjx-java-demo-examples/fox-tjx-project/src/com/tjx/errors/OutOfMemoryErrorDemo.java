package com.tjx.errors;

import java.util.ArrayList;
import java.util.List;

import com.tjx.training.Account;

public class OutOfMemoryErrorDemo {

	public static void main(String[] args) {
		
		System.out.println("main begins");
		
		List<Account> tjxAccounts = new ArrayList<Account>();
		int count = 1;
		while(true) {
			
			tjxAccounts.add(new Account("saravanan", 1L));
			System.out.println(count++);
		}
	}

}
