package com.automobile.twowheeler;

import com.automobile.Vehicle;

class VehicleFactory{
	Vehicle getVehicle(String nameOfVehicle) {
		if(nameOfVehicle.equals("Honda"))
		{
			return new Honda();
		}
		else if(nameOfVehicle.equals("Hero"))
		{
			return new Hero();
		}
		else 
		return null;
	}
}

public class Test {

	public static void main(String[] args) {
		VehicleFactory vf=new VehicleFactory();
		Vehicle v=vf.getVehicle("Honda");
		System.out.println("Model Name : "+v.getModelName());
		System.out.println("Registration No: "+v.getRegistrationNumber());
		System.out.println("Name of the owner : "+v.getownerName());
		Hero hero=new Hero();
		Honda honda=new Honda();
		
		
		
		

	}

}
