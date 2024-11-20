package com.tjx.stocks;

import java.util.Scanner;

public class StockApp {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("main begins");
		StockAccount account = promptAccountInput();
		printAccountSummary(account);
		
		promptStockToBuy(account);
		System.out.println("account data after stock buy");
		printAccountSummary(account);
		
		
		System.out.println("main ends");

	}

	private static void promptStockToBuy(StockAccount account) {
		System.out.println("Let us buy a stock");
		System.out.println("enter stock symbol: ");
		String stockSymbol = scanner.next();
		System.out.println("enter price per share: ");
		double stockPrice = scanner.nextDouble();
		System.out.println("enter shares to buy: ");
		int stockShares = scanner.nextInt();
		
		Stock stockToBuy = new Stock(stockSymbol, stockPrice, stockShares);
		account.buyStock(stockToBuy);
	}

	private static void printAccountSummary(StockAccount account) {
	
		
		System.out.println("Your account summary");
		System.out.println("name: " + account.getAccountName());
		System.out.println("balance: " + account.getAccountBalance());
	}

	private static StockAccount promptAccountInput() {
		System.out.println("welcome to stock app");
		System.out.println("your name: " );
		
		String name = scanner.nextLine();
		System.out.println("your initial balance: " );
		
		double balance = scanner.nextDouble();
		
		StockAccount account = new StockAccount();
		account.setAccountName(name);
		if(balance <=0) {
			System.out.println("negative balances not allowed");
			System.out.println("let us open an account with initial balance of 1000- gift from company ");
			balance =StockAccount.getGiftBalance();
		}
		account.setAccountBalance(balance);
		return account;
	}

}
