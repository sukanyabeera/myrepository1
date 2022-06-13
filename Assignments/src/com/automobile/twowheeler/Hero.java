package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

	public String getModelName() {
		
		
		return "Passion pro";
	}

	public String getRegistrationNumber() {
		
		
		return "TSHero45283";
	}
	public String getownerName() {
		
		System.out.println("current speed of Hero :"+getSpeed());
		radio();
	
		return "sukanya";
	}
	public int getSpeed() 
	{
		
		return 120;	
	}

	public void radio() {
		
		System.out.println("Hero provides facility to control the radio device ");
	}
}
