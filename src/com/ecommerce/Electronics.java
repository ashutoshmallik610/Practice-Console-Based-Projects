package com.ecommerce;

public class Electronics extends Product
{
	private int warranty;
	private String brand;
	
	public Electronics(String productId, String productName, int price, 
			int warranty, String brand) 
	{
		super(productId, productName, price);
		this.warranty = warranty;
		this.brand = brand;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public void displayDetails()
	{
		System.out.println("Product Id : "+getProductId());
		System.out.println("Product Name : "+getProductName());
		System.out.println("Product price : "+getPrice());
		System.out.println("Product warranty : "+getWarranty());
		System.out.println("Product brand : "+getBrand());
	}
	
}
