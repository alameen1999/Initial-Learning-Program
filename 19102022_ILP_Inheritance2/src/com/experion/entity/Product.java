package com.experion.entity;

public class Product {
	private String customerId;
	private String customerName;
	private String accountType;
	public Product(String customerId, String customerName, String accountType) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountType = accountType;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
	

}
