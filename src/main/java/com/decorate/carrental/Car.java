package com.decorate.carrental;

public class Car extends VehicleDecorator{

	public Car(Vehicle vehicle) {
		super(vehicle);
		
	}
	
	@Override
	public float getCost(int num,String type) {	
		if(type.equalsIgnoreCase("AC"))		
			return super.getCost(num,type)+(2 * num);
		else
			return super.getCost(num,type);
	}
}
