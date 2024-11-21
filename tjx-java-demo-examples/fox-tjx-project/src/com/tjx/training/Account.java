package com.tjx.training;

import java.util.Objects;

public class Account {
	
	private String accountName;
	private Long accountId;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}


	public Account(String name, Long id) {
		super();
		this.accountName = name;
		this.accountId = id;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public Long getAccountId() {
		return accountId;
	}


	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}


	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountId=" + accountId + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(accountId, accountName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountId, other.accountId) && Objects.equals(accountName, other.accountName);
	}


	
	
	

}
