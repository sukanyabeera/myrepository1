package com.factoryMethodProgram;

interface Furniture3{

	abstract void cost();
	abstract void material();
}

class HomeFurniture3 implements Furniture3{
	public void cost() {
		System.out.println("This is the cost of the Home furniture ");
	}
	public void material() {
		System.out.println("The material used for home Furniture is wood");
	}
	
}
class OfficeFurniture3 implements Furniture3{
	public void cost() {
		System.out.println("This is the cost of the Office furniture ");
	}
	public void material() {
		System.out.println("The material used for Office  Furniture is wood");
	}
}
class FurnitureFactory3 {
	//factory method returns super class, it doesnot return primitive type or void
	Furniture3 getFurniture(String furniture)
	{
		
		if(furniture.equals("home"))
		{
			return new HomeFurniture3();
		}
		else if(furniture.equals("office"))
		{
			return new OfficeFurniture3();
		}
		else 
			return null;
			
	}
}

public class FactoryMethodProgram {

	public static void main(String[] args) {
		FurnitureFactory3 funfact =new FurnitureFactory3 ();
		Furniture3 furni=funfact.getFurniture("office");
		furni.cost();
		furni.material();

	}

}
