package com.minibank;

public class InsufficientBalanceException extends RuntimeException
{
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
