package com.Exceptions;

class OfficeFurniture{
	int price;
	String item;
	int discount;
	int discountpercent;
	
	OfficeFurniture(int price)
	{
		this.price=price;
		 discountpercent=0;
		 item="canopy";
	}
	
	public void discount() 
	{
		//if the number is divided by 0 then occurs arithmetic Exception
		try {
		discount=price/discountpercent;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("you got "+discountpercent+"% discount ie. "+discount );
		System.out.println("the actual price of the "+item+" is "+ price);
		
	}
}

public class ArithmeticException {

	public static void main(String[] args) {
		
		OfficeFurniture furni=new OfficeFurniture(2000);
		furni.discount();
	

	}

}
