package com.minibank;

public class BankService 
{
	public void checkBalance(Account acc)
	{
		System.out.println("Balance is : "+acc.getBalance());
	}
	public void deposit(Account acc, int depositAmount) throws InvalidAmountException
	{
		if(depositAmount <= 0)
		{
			throw new InvalidAmountException("invalid deposit amount");
		}
		else
		{
			int totalBalance = acc.getBalance()+depositAmount;
			System.out.println("Balance deposited Successfully");
			acc.setBalance(totalBalance);
		}
	}
	public void withdraw(Account acc, int withdrawAmount) throws InsufficientBalanceException
	{
		if(withdrawAmount <= 0)
		{
			throw new InvalidAmountException("invalid withdraw amount");
		}
		else if(withdrawAmount > acc.getBalance())
		{
			throw new InsufficientBalanceException("insufficient balance");
		}
		else
		{
			int totalBalance=acc.getBalance()-withdrawAmount;
			System.out.println("Withdraw  Successfull");
			acc.setBalance(totalBalance);
		}
	}
}
