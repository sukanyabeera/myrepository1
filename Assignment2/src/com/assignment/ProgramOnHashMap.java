package com.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class ProgramOnHashMap {

	public static void main(String[] args) {
		
		HashMap<String,String> capitals=new HashMap<>();
		
		 capitals.put("telangana", "Hyderabad");
		 capitals.put("kerala", "Thiruvananthapuram");
		 capitals.put("Goa", "panaji");
		 capitals.put("Rajasthan", "Jaipur");
		 capitals.put("Karnataka", "Banglore");
		 capitals.put("Maharashta", "Mumbai");
		 capitals.put("Thamilnadu", "chennai");
		 capitals.put("Bihar", "Patna");
		 
		// System.out.println(capitals);
		 
		 System.out.println("--Iterating the map using keysetIterator---");
		 
		 Iterator<String> itr = capitals.keySet().iterator();
	        
	        while (itr.hasNext())
	        {
	            String key =itr.next();
	            
	            System.out.println("Key : "+key+"   Value : "+capitals.get(key));
	        }
	        
	     System.out.println("------------------------------------------");
		 System.out.println("Checking a particular key exists or not ");
		 
		 
		 System.out.println(" Is Goa exists? "+capitals.containsKey("Goa"));
	        
         System.out.println("Checking a particular valus exists or not ");
		 
		 
		 System.out.println(" Is Mumbai exists? "+capitals.containsValue("Mumbai"));
	        
		/*
		  Set<String> set=capitals.keySet();
		   for(String key:set) {
			 System.out.println(key  + ":   "+capitals.get(key)); 
		     }
		 */
		 
		 
		
		
	}

}
