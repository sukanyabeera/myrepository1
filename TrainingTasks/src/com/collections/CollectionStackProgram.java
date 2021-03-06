package com.collections;

import java.util.Stack;

public class CollectionStackProgram {

	public static void main(String[] args) {

		Stack<String> furni=new Stack<String>();
		furni.push("jimmy");
		furni.push("john");
		furni.push("juda");
		furni.push("juda");
		furni.push("jack");
		furni.push(" ");
		furni.push("caleb");
		furni.push("emeto");
		
		for(String str:furni) {
			System.out.println(str);
		}
		
		Stack<String> eve=new Stack<String>();
		eve.push("Rosy");
		eve.push("julie");
		eve.push("nissi");
		eve.push("persis");
		eve.push("gracina");
		eve.push("mercy");
		
		for(String str:eve) {
			System.out.println(str);
		}
		
		//it is accepting duplicate values and null values
		
		//when we pop() it is removing the last element because stack follows last in first out order
		furni.pop();
		System.out.println(furni);
		furni.push("sony");
		System.out.println(furni.empty());
		//stack following insertion order while displaying the elements
		System.out.println(furni);
		
		//peek() is used to retrieve/display the last element
		System.out.println(furni.peek());
		System.out.println(furni);
		
		//it returns the value at given index 
		System.out.println(furni.get(2));
		
      	//removes the element at specified index
		System.out.println(furni.remove(2));
		System.out.println(furni);
		//returns first element
		System.out.println(furni.firstElement());
		System.out.println(furni.isEmpty());
		//returns the last element
		System.out.println(furni.lastElement());
		System.out.println(furni);
		//it returns the position of the elements and return -1 of not found
		System.out.println(furni.search("juda"));
		System.out.println(furni.search("mani"));
		//equals() check the size and values of both the objects and retuns boolean
		System.out.println(furni.equals(eve));
		
		
		
	}

}
