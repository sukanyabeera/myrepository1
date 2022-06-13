package com.interfacres;
//we cannot use constructors inside interfaces bcoz we can't create obj for interfaces and construstors gets invoked only by obj creation
interface OnlineFurniture{
	
	void selectTheBrand(String brand);
	void selectItem(String item);
	void numberOfItems(int number);
	void makeAnOrder();
}
class OfficeFurniture implements OnlineFurniture{
	String item;
	String brand;
	String orderConform;
	int number;
	OfficeFurniture(){
		System.out.println("1.tables 2.chairs 3.sofa ");
	}
	
	public void selectTheBrand(String brand){
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
public class ProgramOfInterface {
	public static void main(String[] args) {
		OfficeFurniture office=new OfficeFurniture();
		office.selectTheBrand("ikea");
		office.selectItem("chair");
		office.numberOfItems(3);
		office.makeAnOrder();
	}
}
