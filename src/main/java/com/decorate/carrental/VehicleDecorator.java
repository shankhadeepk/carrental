package com.decorate.carrental;

public class VehicleDecorator implements Vehicle{
	Vehicle vehicle;
	
	public VehicleDecorator(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	public float getCost(int num,String type) {
		
		return vehicle.getCost(num,type);
	}

}
