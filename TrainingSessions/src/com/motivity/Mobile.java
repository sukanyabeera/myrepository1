package com.motivity;
public class Mobile {
	//method overloading 
	void userRequirement(String brand)
	{if(brand=="vivo")
		{
			System.out.println("The cost of "+brand+"is 15,000 ");
		}	
		else if(brand=="redmi")
		{
			System.out.println("The cost of "+brand+"is 13,000 ");
		}
		else
		{
			System.out.println("sorry! not available");
		}
	}
	void userRequirement(String brand, String color)
	{
		if(brand=="vivo"&&color=="blue") 
		{
			System.out.println("available and the cost is 15000");
		}
		else if(brand=="vivo"&&color=="black") 
		{
			System.out.println("available and the cost is 15000");
		}
		else
		{
			System.out.println("sorry not available");
		}
		}
	void userRequirement(String brand, int cost)
	{
		if(brand=="vivo"&&cost>=15000) 
		{
			System.out.println("vivo is available with"+cost+"price");
		}
		else if(brand=="redmi"&&cost>=13000) 
		{
			System.out.println("it is available within your budget,happy shopping");
		}
		else
		{
			System.out.println("sorry not available");
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Mobile mob=new Mobile();
    mob.userRequirement("vivo");
    mob.userRequirement("realme","blue color");
    mob.userRequirement("redmi",14000);
	}
}

