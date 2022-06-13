package com.innerclasses;

class Furniture1{
	 static String material="wooden";
	 String material1;
	 
	  Furniture1()
	  {
		 material1="Red wood";
	 }
	void comfort() 
	{
		System.out.println("comfortable furniture made with "+material1);
	}
	
	//static inner class and we cannot use instance variables inside static 
	 static class  HomeFurniture
	 {    
		public void feel() 
		{
			System.out.println("you feel comfortable its a "+material+" furniture");
		}
		static void look() 
		{
			System.out.println("it looks good it "+material+" funiture");
		}
	}
}
public class staticInnerClass {

	public static void main(String[] args) {
		Furniture1 furni=new Furniture1();
		furni.comfort();
		Furniture1.HomeFurniture table=new Furniture1.HomeFurniture();
		table.feel();
		Furniture1.HomeFurniture.look();

	}

}
