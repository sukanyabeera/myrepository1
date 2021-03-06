package com.factoryMethodProgram;

interface Furniture{
	
	void selectTheBrand(String brand);
	void selectItem(String item);
	void numberOfItems(int number);
	void makeAnOrder();
}
class OfficeFurniture implements Furniture{
	String item;
	String brand;
	String orderConform;
	int number;
	/*OfficeFurniture(){
		System.out.println("1.tables 2.chairs 3.sofa ");
	}*/
	
	public  void selectTheBrand(String brand){
		this.brand=brand;
		System.out.println("selected "+brand+" brand");
	}
	public void selectItem(String item) {
		this.item=item;
		System.out.println("selected "+ item);
	}
	public void numberOfItems(int number) {
		System.out.println("thank you!");
	}
	public void makeAnOrder() {
		 System.out.println("order conformed");
		 System.out.println("we will deliver you "+number+" "+item+"s 0f "+brand+" brand");
	}
}

class FurnitureFactory{
	
	Furniture getFurniture(String furniture)
	{
		if(furniture.equals("OfficeFurniture")) {
			return new OfficeFurniture();
		}
		else {
		return null;
	}
}
public class ProgramOnFactoryMethod {

	public static void main(String[] args) {
		FurnitureFactory funfact=new FurnitureFactory();
		Furniture furni=funfact.getFurniture("OfficeFurniture");
		furni.selectTheBrand("ikea");
		//furni.selectItem("chair");
		
	}
}
}
