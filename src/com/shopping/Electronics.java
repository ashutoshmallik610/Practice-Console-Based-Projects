package com.shopping;

public class Electronics extends Product
{
	private String brand;
	private String modelNumber;
	private int warrantyPeriod;
	
	public Electronics(String productName, int price, int quantity, String brand,
			String modelNumber, int warrantyPeriod) 
	{
		super(productName, price, quantity);
		setBrand(brand);
		setModelNumber(modelNumber);
		setWarrantyPeriod(warrantyPeriod);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) 
	{
		if(brand == null || brand.isEmpty())
		{
			System.out.println("Invalid Brand");
			this.brand = null;
		}
		else
		{
			this.brand = brand;
		}
		
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) 
	{	
		if(modelNumber == null || modelNumber.isEmpty())
		{
			System.out.println("Invalid Model number");
			this.modelNumber=null;
		}
		else
		{
			this.modelNumber = modelNumber;
		}
		
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) 
	{	
		if(warrantyPeriod > 0)
		{
			this.warrantyPeriod = warrantyPeriod;
		}
		else
		{
			System.out.println("Invalid Warranty period");
			this.warrantyPeriod=0;
		}
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Product Brand : ").append(getBrand()).append("\n");
		sb.append("Model number of the Product : ").append(getModelNumber()).append("\n");
		sb.append("Year of warranty : ").append(getWarrantyPeriod());
		
		System.out.println(sb);
	}
}
