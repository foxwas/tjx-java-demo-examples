package com.tjx.stocks;

public class Stock {
	
	private String stockSymbol;
	private Double stockPrice;	//per share
	private Integer stockShares;
	
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}


	public Stock(String stockSymbol, Double stockPrice, Integer stockShares) {
		super();
		this.stockSymbol = stockSymbol;
		this.stockPrice = stockPrice;
		this.stockShares = stockShares;
	}


	public String getStockSymbol() {
		return stockSymbol;
	}


	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}


	public Double getStockPrice() {
		return stockPrice;
	}


	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}


	public Integer getStockShares() {
		return stockShares;
	}


	public void setStockShares(Integer stockShares) {
		this.stockShares = stockShares;
	}
	
	
	

}
