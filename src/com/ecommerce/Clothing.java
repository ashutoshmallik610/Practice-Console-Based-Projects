package com.ecommerce;

public class Clothing extends Product
{
	private String size;
	private String fabric;
	
	public Clothing(String productId, String productName, int price, 
			String size, String fabric) 
	{
		super(productId, productName, price);
		this.size = size;
		this.fabric = fabric;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	@Override
	public void displayDetails()
	{
		System.out.println("Product Id : "+getProductId());
		System.out.println("Product Name : "+getProductName());
		System.out.println("Product price : "+getPrice());
		System.out.println("Product size : "+getSize());
		System.out.println("Product fabric : "+getFabric());
	}
}
