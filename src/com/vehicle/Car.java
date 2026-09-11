package com.vehicle;

public class Car extends Vehicle
{
	private String carModel;
	
	public Car(String registrationNo, String carModel) 
	{
		super(registrationNo);
		setCarModel(carModel);
	}
	
	
	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) 
	{
		if(carModel==null || carModel.isEmpty())
		{
			System.out.println("Invalid Model");
			this.carModel=null;
		}
		else
		{
			this.carModel = carModel;
		}
	}

	@Override
	public void showDetails()
	{
		System.out.println("Car Model : "+getCarModel());
		super.showDetails();

	}
	
	public void openSunRoof()
	{
		System.out.println("Car sunroof opened....");
	}
}
