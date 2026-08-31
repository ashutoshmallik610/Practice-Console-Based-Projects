package com.minibank;

public class TransactionService 
{
	public void transfer(Account acc, int transferAmount)
	{
		if(transferAmount <= 0)
		{
			throw new InvalidAmountException("invalid transfer amount");
		}
		else if(transferAmount > acc.getBalance())
		{
			throw new InsufficientBalanceException("insufficient balance");
		}
		else if(transferAmount > 50000)
		{
			throw new TransferLimitExceededException("transfer limit exceeds");
		}
		else
		{
			int totalBalance=acc.getBalance()-transferAmount;
			System.out.println("Transfer Successfull");
			acc.setBalance(totalBalance);
		}
	}
}
