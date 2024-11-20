package com.tjx.training;

public class Account {
	
	//instance fields -- instance variables - attributes - properties -- instance data members
	
	private String accountName;
	private Integer accountId;
	private Long accountNamber;
	private Double accountBalance;
	
	
	//constructor method
	
	public Account(String accountName, Integer accountId, Long accountNamber, Double accountBalance) {
		super();
		this.accountName = accountName;
		this.accountId = accountId;
		this.accountNamber = accountNamber;
		this.accountBalance = accountBalance;
	}


	//instance methods -functions - behavior
	
	private void printAccountStatus() {
		System.out.println("name: " + getAccountName());
		System.out.println("id: " + getAccountId());
	}
	
	public void printAccountStatus(String message) {
		
		System.out.println(message);
		System.out.println("name: " + getAccountName());
		System.out.println("id: " + getAccountId());
	}
	
	public void printAccountStatus(String message, Double discountData	) {
		
		System.out.println(message);
		System.out.println("name: " + getAccountName());
		System.out.println("id: " + getAccountId());
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Long getAccountNamber() {
		return accountNamber;
	}
	public void setAccountNamber(Long accountNamber) {
		this.accountNamber = accountNamber;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	

	

}
