package com.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class CollectionSetProgram {

	public static void main(String[] args) {
		
		TreeSet<String> tree=new TreeSet<>();
		
		tree.add("mahi");
		tree.add("ram");
		tree.add("john");
		//tree.add("Alex");
		//tree.add("Andrew");
		tree.add("jimmy");
		tree.add("juda");
		
		System.out.println(tree);
		//it returns the elements greater than or equal to the given elements
		System.out.println(tree.tailSet("j"));
		//it returns the elements which in range between from element and toelement
		System.out.println(tree.subSet("j", "n"));
		//it returns the elements the are stictly lessthan to the given element
		System.out.println(tree.headSet("j"));
		//it returns and removes last highest element 
		System.out.println(tree.pollLast());
		System.out.println(tree);
		//it returns and removes first element
		System.out.println(tree.pollFirst());
		System.out.println(tree);
		//it return the last element 
		System.out.println(tree.last());
		System.out.println(tree);
		//it returns the greatest element in the list which is strictly less than the given element
		System.out.println(tree.lower("m"));
		//return the lowest member of the list
		System.out.println(tree.first());
		//returns the greatest element less than or equal to specified
		System.out.println(tree.floor("m"));
		//removes a particular element
		System.out.println(tree.remove("l"));
		//it removes all the elements from the list
		System.out.println(tree.removeAll(tree));
		System.out.println(tree);
		
	}

}
