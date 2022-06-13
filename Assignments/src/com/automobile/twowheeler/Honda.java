package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle{

	
	public String getModelName() {
		
		return "Honda City";
	}

	public String getRegistrationNumber() {
		
		return "TSHonda145";
	}

	public String getownerName() {
		System.out.println("current speed of Honda :"+getSpeed());
		cdplayer();
		
		return "shiny";
	}
	public int getSpeed() 
	{
		return 400;
	}
	public void cdplayer()
	{
		System.out.println("Honda provides facility to control the cd player device which is available in the car. ");
	}



}
