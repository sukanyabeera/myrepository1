package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		Set<String> names=new LinkedHashSet<>();
     
     names.add("mahi");
     names.add("neha");
     names.add("pooja");
     names.add("navya");
     names.add("raj");
     names.add("rohan");
     names.add("peter");
     names.add("paul");
     
     Set<String> names2=new LinkedHashSet<>();
     
     names2.add("rosy");
     names2.add("john");

    System.out.println("the elements of first set");
     Iterator<String> itr=names.iterator();
     while(itr.hasNext()) {
			System.out.println(itr.next());
		}
     
     System.out.println("......................");
     System.out.println("The elements of second set is ");
     System.out.println(names2);
     System.out.println();
     //adding all the elements of names2 in names 
   System.out.println("adding elements of second obj into first obj - "+names.addAll(names2));
   
   System.out.println("size of the set is - "+names.size());
   System.out.println("checking all the elements of names are present in the name2 - "+names2.containsAll(names));
   System.out.println("The class Name  of names2 object is -  "+names2.getClass());
   //clear () is used to clear all the elments of the specified object
   names.clear();
     System.out.println("this is the empty set after using clear() ------"+names);
	}

}
