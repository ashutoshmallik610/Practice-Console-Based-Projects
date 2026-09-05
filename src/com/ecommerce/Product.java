package com.ecommerce;

public abstract class Product
{
	private String productId;
	private String productName;
	private int price;
	
	public Product(String productId, String productName, int price) 
	{
		this.productId = productId;
		this.productName = productName;
		setPrice(price);
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) 
	{
		if(price>0)
		{
			this.price = price;
		}
		else
		{
		    System.out.println("Invalid Price");
		    this.price = 0;
		}
	}
	public abstract void displayDetails();
	
}
