package com.tjx.oop;

import java.util.Objects;

public class Customer {
	
	private String customerName;
	private Long customerId;
	private String customerEmail;

	public Customer() {
		
	}

	public Customer(String customerName, Long customerId, String customerEmail) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerEmail="
				+ customerEmail + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerEmail, customerId, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customerEmail, other.customerEmail) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName);
	}
	
	

}
