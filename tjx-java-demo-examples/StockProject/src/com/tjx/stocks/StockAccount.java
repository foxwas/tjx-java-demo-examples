package com.tjx.stocks;

public class StockAccount {
	
	
	private static final Double GIFT_BALANCE =1000.0;
	
	public static Double getGiftBalance() {
		return GIFT_BALANCE;
	}

//	public static void setGiftBalance(Double giftBalance) {
//		//this.accountName= "guest"; Cannot use this in a static context
//		
//		StockAccount.giftBalance = giftBalance;
//	}
	
	private String accountName;
	private Double accountBalance;
	private Stock accountStock;
	
	
	public StockAccount() {
		// TODO Auto-generated constructor stub
	}

	public StockAccount(String accountName, Double accountBalance) {
		super();
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	
	public StockAccount(String accountName) {
		super();
		this.accountName = accountName;
	}

	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Stock getAccountStock() {
		return accountStock;
	}

	public void setAccountStock(Stock accountStock) {
		this.accountStock = accountStock;
	}
	
	//code to buyStock()
	
	public void buyStock(Stock stockToBuy) {
		//compute the cost to buy
		double costToBuy = stockToBuy.getStockPrice() * stockToBuy.getStockShares();
		if(this.getAccountBalance() < costToBuy) {
			System.out.println("You do not have enough funds to buy this stock");
		}
		else {
			//this.setAccountStock(stockToBuy);  //
			if(this.accountStock == null) {
					this.accountStock = stockToBuy;
					this.accountBalance = this.accountBalance - costToBuy;
					System.out.println("the new balance is: " + this.accountBalance);
			}
		}
		
		
	}
	
	
	
	
	

}
