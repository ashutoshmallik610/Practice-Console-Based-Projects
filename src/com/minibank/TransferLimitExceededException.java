package com.minibank;

public class TransferLimitExceededException extends RuntimeException
{
	public TransferLimitExceededException(String msg)
	{
		super(msg);
	}
}
