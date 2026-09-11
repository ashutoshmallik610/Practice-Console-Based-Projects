package com.vehicle;

public class Truck extends Vehicle
{
private String truckModel;
	
	public Truck(String registrationNo, String truckModel) 
	{
		super(registrationNo);
		setTruckModel(truckModel);
	}
	
	
	public String getTruckModel() {
		return truckModel;
	}

	public void setTruckModel(String truckModel) 
	{
		if(truckModel==null || truckModel.isEmpty())
		{
			System.out.println("Invalid Model");
			this.truckModel=null;
		}
		else
		{
			this.truckModel = truckModel;
		}
	}
	
	@Override
	public void showDetails()
	{
		System.out.println("Truck Model : "+getTruckModel());
		super.showDetails();
	}
	
	public void loadGoods()
	{
		System.out.println("Truck is loading goods.......");
	}
	
}
