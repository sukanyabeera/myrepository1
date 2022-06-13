package com.motivity;
class Vehicle {
	void cost() {
		System.out.println("no cost for vehicle");
	}
	void milage() {
		System.out.println("no milage for vehicle");
	}
}
class Bike extends Vehicle{
	void cost() {
		System.out.println("no cost for bike");
	}
	void milage() {
		System.out.println("minimum milage of a bike is 5km");
	}
}
class Yamaha extends Bike{
	void cost() {
		System.out.println("2lakhs ");
	}
	void milage() {
		System.out.println("40kms");
	}
	void color() {
		System.out.println("yamaha is in black color");
	}
	
}
 

public class MultipleInheritance {
//spell mistake , it is multilevel inheritance
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehobj=new Vehicle();
		vehobj.cost();
		vehobj.milage();
		vehobj=new Bike();
		vehobj.cost();
		//Bike bike=new Bike();
		vehobj.milage();
	    Yamaha yamaha=new Yamaha();
		yamaha.cost();
		
		yamaha.milage();
		yamaha.color(); 
		//to display the color of yamaha , need to create yamaha obj because color method is not there in the super class
	}

}
