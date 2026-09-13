package com.bank.acc.trans.syst;

import java.util.Objects;

public abstract class Account implements Transaction
{
	private String accNumber;
	private String holderName;
	private int balance;
	
	static
	{
		System.out.println("\n==========================================");
		System.out.println("        	STATE BANK OF INDIA");
		System.out.println("==========================================");
	}
	
	public Account(String accNumber, String holderName, int balance) 
	{
		super();
		setAccNumber(accNumber);
		setHolderName(holderName);
		setBalance(balance);
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) 
	{
		if(accNumber == null || accNumber.isEmpty())
		{
			throw new InvalidAccountDetails("Invalid acccount number");
		}
		else
		{
			this.accNumber = accNumber;
		}
		
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) 
	{
		if(holderName == null || holderName.isEmpty())
		{
			throw new InvalidAccountDetails("Invalid acccount holder name");
		}
		else
		{
			this.holderName = holderName;
		}
		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) 
	{
		if(balance >= 0)
		{
			this.balance = balance;
		}
		else
		{
			throw new InvalidAccountDetails("Invalid account balance");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(accNumber);
	}

	@Override
	public boolean equals(Object obj) 
	{
		Account other = (Account) obj;
		return Objects.equals(accNumber, other.accNumber);
	}
	
	public String displayDetails()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Account number		: ").append(accNumber).append("\n")
			.append("Account Holder Name	: ").append(holderName).append("\n")
			.append("Balance			: ").append(balance).append("\n");
		
		return sb.toString();
		
	}

	public synchronized void depositAmount(int amount)
	{
	    int oldBalance = getBalance();

	    System.out.println(Thread.currentThread().getName()
	            + " started deposit.");

	    setBalance(oldBalance + amount);

	    System.out.println(Thread.currentThread().getName()
	            + " deposited ₹" + amount);

	    System.out.println("Balance: ₹" + getBalance());
	}


	public synchronized void withdrawAmount(int amount)
	{
	    int oldBalance = getBalance();

	    System.out.println(Thread.currentThread().getName()
	            + " started withdrawal.");

	    if(amount <= oldBalance)
	    {
	        setBalance(oldBalance - amount);

	        System.out.println(Thread.currentThread().getName()
	                + " withdrew ₹" + amount);

	        System.out.println("Balance: ₹" + getBalance());
	    }
	    else
	    {
	        System.out.println(Thread.currentThread().getName()
	                + " → Insufficient balance.");
	    }
	}
	
}
