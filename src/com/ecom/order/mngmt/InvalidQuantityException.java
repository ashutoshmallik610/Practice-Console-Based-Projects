package com.ecom.order.mngmt;

public class InvalidQuantityException extends RuntimeException
{
	public InvalidQuantityException(String msg)
	{
		super(msg);
	}
}
