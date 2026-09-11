package com.vehicle;

public class Bike extends Vehicle
{
	private String bikeModel;
	
	public Bike(String registrationNo, String bikeModel) 
	{
		super(registrationNo);
		setBikeModel(bikeModel);
	}
	
	
	public String getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(String bikeModel) 
	{
		if(bikeModel==null || bikeModel.isEmpty())
		{
			System.out.println("Invalid Model");
			this.bikeModel=null;
		}
		else
		{
			this.bikeModel = bikeModel;
		}
	}
	
	@Override
	public void showDetails()
	{
		System.out.println("Bike Model : "+getBikeModel());
		super.showDetails();
	}
	
	public void wheelie()
	{
		 System.out.println("Bike is performing a wheelie.");
	}
}
