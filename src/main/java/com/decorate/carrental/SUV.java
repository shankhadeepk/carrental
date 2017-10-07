package com.decorate.carrental;

public class SUV extends VehicleDecorator{

	public SUV(Vehicle vehicle) {
		super(vehicle);		
	}
	@Override
	public float getCost(int num,String type) {		
		return super.getCost(num,type) + (2 * num);
	}
}
