package com.bank.acc.trans.syst;

import java.util.Scanner;

public class SavingsAccount extends Account
{
	private int interestRate = 10;

	public SavingsAccount(String accNumber, String holderName, int balance) 
	{
		super(accNumber, holderName, balance);
	} 

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void deposit() {
		
		System.out.println("Enter the deposite balance, you want to deposit...");
		int depositeBalance = sc.nextInt();
		
		int totalBalance = getBalance() + depositeBalance;
		
		setBalance(totalBalance);

		System.out.println("After depositing " + depositeBalance+ " the total balance is : " + getBalance());
		
	}

	@Override
	public void withdraw() {

	    System.out.println("Enter the amount you want to withdraw...");
	    int withdrawBalance = sc.nextInt();

	    if (withdrawBalance <= 0) 
	    {
	        System.out.println("Invalid withdrawal amount.");
	        return;
	    }

	    if (withdrawBalance > getBalance()) 
	    {
	        System.out.println("Insufficient balance.");
	        return;
	    }

	    int totalBalance = getBalance() - withdrawBalance;

	    setBalance(totalBalance);

	    System.out.println("After withdrawing " + withdrawBalance+ ", total balance is: " + getBalance());
	}
	
	public void calculateInterest()
	{
		int calculatedInterest = (getBalance() * interestRate) / 100;
		
		System.out.println("Calculated Interest by applying interest rate of " + interestRate + "%: $" + calculatedInterest);
		
		int totalBalance = getBalance() + calculatedInterest;
		
		setBalance(totalBalance);
	}
	
	public void checkBalance()
	{
		System.out.println("Your balance is : "+getBalance());
	}

	public void setInterestRate(int interestRate) 
	{
		this.interestRate = interestRate;
	}
	
	@Override
	public String displayDetails()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.displayDetails());
		sb.append("Interest Rate		: ").append(interestRate).append("\n");
		
		return sb.toString();
		
	}
}
