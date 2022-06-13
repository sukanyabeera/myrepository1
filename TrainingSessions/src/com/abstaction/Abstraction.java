package com.abstaction;
abstract class Furniture{
	
	abstract void material();
	abstract void warranty();
	abstract void measurements();
	void makeorder(int numberOfOrders) {
		System.out.println(numberOfOrders+" orders received");
		System.out.println();
	}
}
class Table extends Furniture{
	void material() {
		System.out.println("plastic table");
	}
	void warranty() {
		System.out.println("3 months");
	}
	void measurements(){
		System.out.println("36cmX60cm ");
	}
}
class cot extends Furniture{
	void material() {
		System.out.println("wooden cot");
	}
	void warranty() {
		System.out.println("5 years ");
	}
	void measurements(){
		System.out.println("60cm X 120cm ");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Furniture furni;
		
		furni=new Table();
		furni.material();
		furni.warranty();
		furni.measurements();
		furni.makeorder(5);
		
		furni=new cot();
		furni.material();
		furni.warranty();
		furni.measurements();
		furni.makeorder(3);
	}
}
