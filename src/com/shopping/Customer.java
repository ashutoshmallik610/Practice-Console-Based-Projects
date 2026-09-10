package com.shopping;

public class Customer 
{
	private String custId;
	private String name;
	private String phNumber;
	private String gmail;
	
	public Customer(String name, String phNumber, String gmail) 
	{
		setName(name);
		setPhNumber(phNumber);
		setGmail(gmail);
	}
	
	static int count;
	static
	{
		count=100;
	}
	{
		custId="CUST"+count;
		count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		if((name != null) && (name.contains(" ")))
		{
			this.name = name;
		}
		else
		{
			System.out.println("Invalid Name");
			this.name=null;
		}
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) 
	{
		if((phNumber != null) && (phNumber.length() == 8))
		{
			this.phNumber = phNumber;
		}
		else
		{
			System.out.println("Invalid Phone Number");
			this.phNumber=null;
		}
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) 
	{
		if((gmail != null) && (gmail.contains("@gmail.com")))
		{
			this.gmail = gmail;
		}
		else
		{
			System.out.println("Invalid Gmail");
			this.gmail=null;
		}
	}
	
	public void customerDisplay()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Customer Id  : " ).append(custId).append("\n");
		sb.append("Customer Name : ").append(getName()).append("\n");
		sb.append("Customer Phone Number : ").append(getPhNumber()).append("\n");
		sb.append("Customer Gmail : ").append(getGmail());
		
		System.out.println(sb);
	}
	
}
