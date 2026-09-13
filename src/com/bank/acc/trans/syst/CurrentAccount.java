package com.bank.acc.trans.syst;

import java.util.Scanner;

public class CurrentAccount extends Account
{
	private int overdraftLimit;
	private int transactionFee;
	
	public CurrentAccount(String accNumber, String holderName, int balance, int overdraftLimit,
			int transactionFee) 
	{
		super(accNumber, holderName, balance);
		this.overdraftLimit = overdraftLimit;
		this.transactionFee = transactionFee;
	}
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void deposit() {
		
		System.out.println("Enter the deposite balance, you want to deposit...");
		int depositeBalance = sc.nextInt();
		
		int totalBalance = getBalance() + depositeBalance;
		
		System.out.println("After depositing "+depositeBalance+" the total balance is : "+getBalance());
		
		setBalance(totalBalance);
		
	}

	@Override
	public void withdraw() {

	    System.out.println("Enter withdrawal amount...");
	    int withdrawAmount = sc.nextInt();

	    if (withdrawAmount <= 0) 
	    {
	        System.out.println("Invalid withdrawal amount.");
	    }

	    int totalDeduction = withdrawAmount + transactionFee;

	    int newBalance = getBalance() - totalDeduction;

	    if (newBalance >= -overdraftLimit) {

	        setBalance(newBalance);

	        System.out.println("Successfully withdrew: ₹" + withdrawAmount);
	        System.out.println("Transaction fee: ₹" + transactionFee);
	        System.out.println("Remaining balance: ₹" + getBalance());

	    }
	    else 
	    {
	        System.out.println("Transaction denied!");
	        System.out.println("Overdraft limit exceeded.");
	    }
	}
	
	
	public void checkBalance()
	{
		System.out.println("Your balance is : "+getBalance());
	}
	
	public void deductTransactionFee() 
	{
	    // 1. Calculate what the new balance will be after the fee
	    int newBalance = getBalance() - transactionFee;
	    
	    // 2. Check if the fee pushes the customer past their overdraft limit
	    int maximumNegativeBalance = -overdraftLimit;
	    
	    if (newBalance >= maximumNegativeBalance) {
	        // 3. Update the balance if safe
	        setBalance(newBalance);
	        System.out.println("💼 Transaction fee of $" + transactionFee + " deducted.");
	    } 
	    else 
	    {
	        // This happens if their account is completely maxed out and cannot even afford the fee
	        System.out.println("❌ Cannot deduct fee: Overdraft limit exceeded!");
	    }
	}
	
	@Override
	public String displayDetails()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.displayDetails());
		sb.append("Overdraft Limit		: ").append(overdraftLimit).append("\n")
			.append("Transaction Fee		: ").append(transactionFee).append("\n");
		
		return sb.toString();
		
	}
}
