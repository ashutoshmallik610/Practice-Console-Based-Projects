package com.bank.acc.trans.syst;

import java.util.Scanner;

public class PremiumSavingsAccount extends SavingsAccount
{
	private int cashbackRate = 2;

	public PremiumSavingsAccount(String accNumber, String holderName, int balance) 
	{
		super(accNumber, holderName, balance);
	}

	Scanner sc = new Scanner(System.in);
	
	public void applyCashback() 
	{
		System.out.println("Enter the purchase amount...");
		int purchaseAmount = sc.nextInt();
		// 1. Calculate the cashback reward money
		int cashbackEarned = (purchaseAmount * cashbackRate) / 100;

		// 2. Add the reward money to the current balance
		int newBalance = getBalance() + cashbackEarned;
		setBalance(newBalance);

		System.out.println("🎉 Cashback of $" + cashbackEarned + " added to your account!");
	}
	@Override
	public String displayDetails()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.displayDetails());
		sb.append("Cashback Rate		: ").append(cashbackRate).append("\n");
		
		return sb.toString();
		
	}
}
