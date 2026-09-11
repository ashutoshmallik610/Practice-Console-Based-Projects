package com.vehicle;

public class Driver {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[3];
		
		vehicles[0] = new Car("OD05AB8290", "Verna");
		
		vehicles[1] = new Bike("OD02CS0841", "MT15");
		
		vehicles[2] = new Truck("OD04PL9231", "Verna");
		
		for(Vehicle v : vehicles)
		{
		    v.showDetails();

		    if(v instanceof Car)
		    {
		        Car c = (Car)v;
		        c.openSunRoof();
		    }
		    else if(v instanceof Bike)
		    {
		        Bike b = (Bike)v;
		        b.wheelie();
		    }
		    else if(v instanceof Truck)
		    {
		        Truck t = (Truck)v;
		        t.loadGoods();
		    }

		    System.out.println("----------------");
		}
			
		
	}

}
