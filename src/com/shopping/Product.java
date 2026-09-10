package com.shopping;

public class Product 
{
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productName, int price, int quantity) 
	{
		setProductName(productName);
		setPrice(price);
		setQuantity(quantity);
	}
	static int count;
	static
	{
		count=1010;
	}
	{
		productId="PROD"+count;
		count++;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) 
	{
		if(productName == null || productName.isEmpty())
		{
			System.out.println("Invalid Product Name");
			this.productName=null;
		}
		else
		{
			this.productName = productName;
		}
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) 
	{
		if(price > 0)
		{
			this.price = price;
		}
		else
		{
			System.out.println("Invalid price");
			this.price=0;
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) 
	{
		if(quantity > 0)
		{
			this.quantity = quantity;
		}
		else
		{
			System.out.println("Invalid quantity");
			this.quantity=0;
		}
	}
	public void displayDetails()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Product Id  : " ).append(productId).append("\n");
		sb.append("Product Name : ").append(getProductName()).append("\n");
		sb.append("Price of the Product : ").append(getPrice()).append("\n");
		sb.append("Quantity of the Product : ").append(getQuantity());
		
		System.out.println(sb);
	}
	
}
