package com.experion.entity;

import java.util.ArrayList;

public class CurrentAccount extends Account {
	private String loanNumber;
	private double loanAmount;
	public CurrentAccount(String productName, String loanNumber, double loanAmount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public void checkProductValidity() {
		
		System.out.println("Validity check of loan class called");
		
	}
	
	
	
	
	
}

	
	