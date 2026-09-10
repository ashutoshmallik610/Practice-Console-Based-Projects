package com.shopping;

public class Cart 
{
	
	public void addCart(Product product)
	{
	    System.out.println(product.getProductName()
	            + " added to cart.");
	}
	
	public void removeCart(Product product)
	{
	    System.out.println(product.getProductName()
	            + " removed from cart.");
	}
	
	
}
