package com.assignment;

import java.util.HashMap;
import java.util.Iterator;

public class ProgramonMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> contacts=new HashMap<>();
		
		contacts.put("nissi", 987654);
		contacts.put("Grace", 654321);
		contacts.put("krish",321987);
		contacts.put("nick",789456);
		
		Iterator<String> itr=contacts.keySet().iterator();
		
		while(itr.hasNext()) {
			String key =itr.next();
            
            System.out.println(key+"   "+contacts.get(key));
            
		}
		
		System.out.println("----------------------------------------------------");
        
        System.out.println("Checking if a particular key exists or not:"+ contacts.containsKey(987654));
        System.out.println("Checking if a particular value exists or not :"+ contacts.containsValue("mahi"));
        
		
		
	}

}
