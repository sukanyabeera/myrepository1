package com.innerclasses;

class Interior{
	 int price=2000;
	 String measure=" 30X50";
	void order() {
		int price=2000;
		System.out.println("order confirmed");
		
		 class HomeFurniture{               //local innerclass1
			void cost(){
				System.out.println("cost of the furniture is "+price);
				
				class OfficeFuniture{      //local innerclass2
					void measurementsOfTable() {
						System.out.println("measurements of the Table is "+ measure);
					}
				}
				OfficeFuniture office=new OfficeFuniture();
				office.measurementsOfTable();
			}
			}
		HomeFurniture home=new HomeFurniture();
		home.cost();
		}
	}

public class LocalInnerClass {
	public static void main(String args[]) {
		Interior furni=new Interior();
		furni.order();
		
	}

}
