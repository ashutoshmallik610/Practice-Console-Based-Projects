package com.vehicle;

public class Vehicle 
{	
	private String registrationNo;
	private String state;
	private String district;
	private String series;
	private String number;
	
	public Vehicle(String registrationNo)
	{
		setRegistrationNo(registrationNo);
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) 
	{
		if(registrationNo==null || registrationNo.isEmpty())
		{
			System.out.println("Invalid registration number");
			this.registrationNo=null;
		}
		else
		{
			this.registrationNo = registrationNo;
		}
		
	}
	
	public void showDetails()
	{
		state=getRegistrationNo().substring(0,2);
		System.out.println("State : "+state);
		
		district=getRegistrationNo().substring(2,4);
		System.out.println("District : "+district);
		
		series=getRegistrationNo().substring(4,6);
		System.out.println("Series : "+series);
		
		number=getRegistrationNo().substring(6,10);
		System.out.println("Number : "+number);
	}
}
