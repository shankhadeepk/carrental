package com.decorate.carrental;

public class Diesel implements Vehicle{

	public float getCost(int num,String type) {		
		return num * 8.0f;
	}

}
