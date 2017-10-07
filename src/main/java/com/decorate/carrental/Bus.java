package com.decorate.carrental;

public class Bus extends VehicleDecorator{

	public Bus(Vehicle vehicle) {
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
