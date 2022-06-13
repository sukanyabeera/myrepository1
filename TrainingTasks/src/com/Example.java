package com;

class Decor{
	static {
		System.out.println(" This is Decor static block");
	}
	Decor(){
		System.out.println(" This is Decor constructor");
		
	}
}
 class Design{
	 //constructor invokes after static block
	 Design(){
			System.out.println(" This is Design constructor");
			
		}
	 //static block invokes before constructor 
	 static {
			System.out.println(" This is Design static block");
		}
		
 }


public class Example {

	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException
	{
	
		System.out.println(" main static method");
		Class x=Class.forName("com.Design");
		
		x.newInstance();
		

	}

}
