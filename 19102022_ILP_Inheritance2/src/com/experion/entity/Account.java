package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product {

	private String accountType;
//	private BankServices bankServices;
	private ArrayList<BankServices>bankServices = new ArrayList<BankServices>();
	
public Account(String productCode, String productName, String productType, String accountType,
		ArrayList<BankServices> bankServices) {
	super(productCode, productName, productType);
	this.accountType = accountType;
	this.bankServices = bankServices;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public ArrayList<BankServices> getBankServices() {
	return bankServices;
}
public void setBankServices(ArrayList<BankServices> bankServices) {
	this.bankServices = bankServices;
}

	

}
