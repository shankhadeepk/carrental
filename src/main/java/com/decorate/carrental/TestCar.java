package com.decorate.carrental;

public class TestCar {
	
	public static void main(String[] args) {
		Vehicle veh=new Car(new Diesel());
		System.out.println(veh.getCost(200, "NONAC"));
		veh=new SUV(new Diesel());
		System.out.println(veh.getCost(800, "AC"));
	}

}
