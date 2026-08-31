package com.minibank;

public class Account 
{
	private String accNo;
	private String ifscCode;
	private int balance;
	
	public Account(String accNo, String ifscCode, int balance) {
		super();
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void accountDetails()
	{
		System.out.println("Account number : "+accNo);
		System.out.println("IFSC code : "+ifscCode);
	}
	
}
