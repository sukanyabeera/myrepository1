package com.innerclasses;

class Furniture{
	void order() {
		System.out.println("order confirmed");
		HomeFurniture homefun=new HomeFurniture();
		homefun.cost();
	}		
		class HomeFurniture{
			void cost(){
				System.out.println("cost of the furniture");
				Table tab=new Table();
				tab.measurements();
			}
			class Table{
				void measurements() {
					System.out.println("20X30");
				}
			}
		}
	}
public class customer {

	public static void main(String[] args) {
		Furniture furni=new Furniture();
		furni.order();
		//furni.cost();  we cannot create the object
		Furniture.HomeFurniture homefun=furni.new HomeFurniture();
		
	}

}
