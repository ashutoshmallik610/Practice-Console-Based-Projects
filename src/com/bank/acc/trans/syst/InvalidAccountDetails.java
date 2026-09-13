package com.bank.acc.trans.syst;

public class InvalidAccountDetails extends RuntimeException
{
	public InvalidAccountDetails(String str)
	{
		super(str);
	}
}
