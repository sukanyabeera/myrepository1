package com.Exceptions;

class KitchenFuniture{
	String item;
	KitchenFuniture(){
		item=null;
	}

	public void selectTheThing() 
	{
		try {
			System.out.println("lenght of the item is "+item.length());
	    	}
			catch(NullPointerException e){
				System.out.println(e);
			}
		finally {
			System.out.println(" order conformed");
		}
			
			
	}
}
public class HandlingNullPointerException {

	public static void main(String[] args) {
	
		KitchenFuniture kitch=new KitchenFuniture();
		kitch.selectTheThing();
	}

}
