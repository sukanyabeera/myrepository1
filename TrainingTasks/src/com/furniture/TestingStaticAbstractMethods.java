package com.furniture;
//for abstract methods only public,abstract,final are permitted
   abstract class Furniture{
	abstract String price(int price);
}
 class Chair extends Furniture {
	 String price(int price) { 
		 System.out.println("Chair price is ");
		 return "";
	 }
 }
 
public class TestingStaticAbstractMethods {

	public static void main(String[] args) {
		Furniture furni;
		furni=new Chair();
		System.out.println(furni.price(2000));
		

	}

}
