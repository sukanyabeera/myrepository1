package com.motivity;
//single inheritance
public class Furniture {
void material()
	{
		System.out.println("no material for furniture");
	}
	void price()
	{
		System.out.println("no Price for furniture");
	}	
	void budjet(int budjet)
	{
		if(budjet>=1500) {
			System.out.println("available within your budjet");
		}
		else
		{System.out.println("sorry, notavailable within your budjet");
		}}
	public static void main(String args[]) {
		 Furniture furni =new Furniture();
		 furni.material();
		 furni.price();
		 furni.budjet(1600);
		 furni=new Chair();
		 furni.material();
		 furni.price();
		 furni.budjet(1400);
	}}
 class Chair extends Furniture
 {
	 void material()
		{
			System.out.println("wood");
		}
		void price()
		{
			System.out.println("1500");
		}
		void budjet(int budjet)
		{
			if(budjet>=1500) {
				System.out.println("available within your budjet");
			}
			else
			{
				System.out.println("sorry, notavailable within your budjet");
			}
 }
 }
