package com.innerclasses;
class FurnitureInterior{
	 static String material="wooden";
	 String material1;
	 
	 public void design() {
		 System.out.println("Furniture design is ready");
	 }
	  FurnitureInterior()
	  {
		 material1="Red wood";
		 System.out.println(material+" material used");
	 }
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		FurnitureInterior furni=new FurnitureInterior();
		furni.design();
		
		FurnitureInterior anony=new FurnitureInterior() 
        {
	       public void design() 
	       {
		     System.out.println("interior design is ready");
	       }
};	
anony.design();
	}

}
