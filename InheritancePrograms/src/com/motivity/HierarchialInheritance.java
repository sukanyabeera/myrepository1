package com.motivity;

class Stationary{
	int numberOfItems(int items) {
		System.out.print("number of Stationary items is ");
		return items;
	}
	void purpose(String purpose) {
		System.out.println("Stationary purpose");
	}
}
class Pen extends Stationary{
	int numberOfItems(int items) {
		System.out.print("number of pens is ");
		return items;
	}
	void purpose(String purpose) {
		System.out.println("purpose of pen is for "+purpose);
	}
}
class Paper extends Stationary{
	int numberOfItems(int items) {
		System.out.print("number of Papers is ");
		return items;
	}
	void purpose(String purpose) {
		System.out.println("purpose of paper is for "+purpose);
	}
}
public class HierarchialInheritance {
	public static void main(String args[]) {
		Stationary stationary=new Stationary();
		System.out.println(stationary.numberOfItems(0));
		stationary.purpose("stationary");
		
		stationary=new Pen();
		System.out.println(stationary.numberOfItems(50));
		stationary.purpose("writing");
		
		stationary=new Paper();
		System.out.println(stationary.numberOfItems(200));
		stationary.purpose("Drawing");
	}

}
