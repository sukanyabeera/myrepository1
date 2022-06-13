package com.motivity;
//we can use instance variable,static variables inside instance method
class Money{
	String name;               //instance variable
	 static int payment=500;  // static variable
	void transaction() {      // instance method
		System.out.println(name+" is done with the payment of "+payment);
	}                          
}
//we can use static variable inside static method bcoz for static no need of creating obj
//we cannot use instance variable inside static method bcoz instance variable needs obj creation whereas 
//static method needs a class
class Competition{
	String name;
	static int price=5000;   //static variable 
	static void wonPrice() { //static method
		System.out.println(" mohan won "+price+" rupees cash prise");
		//System.out.println(name+"won "+price+" rupees cash prise");
	}
}

public class StaticInstanceExample {
public static void main(String args[]) {
	Money moneyobj=new Money();
	
	moneyobj.name="raj";
	moneyobj.transaction();
	Competition compobj=new Competition();//created obj for instance variable
	compobj.name="mohan";     //assigning value to an instance variable
	Competition.wonPrice();
}
}
