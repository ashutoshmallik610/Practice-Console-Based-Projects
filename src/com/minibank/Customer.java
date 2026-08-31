package com.minibank;

public class Customer 
{
	private String custName;
	private String gender;
	private String age;
	
	public Customer(String custName, String gender, String age) {
		super();
		this.custName = custName;
		this.gender = gender;
		this.age = age;
	}

	public String getCustName() {
		return custName;
	}

	public String getGender() {
		return gender;
	}

	public String getAge() {
		return age;
	}
	
	public void displayDetails()
	{
		System.out.println("Customer Name : "+custName);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
	}
}
