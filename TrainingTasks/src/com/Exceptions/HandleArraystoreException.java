package com.Exceptions;

public class HandleArraystoreException {

	public static void main(String[] args) {
	
		Object[] name=new String[4];
		try {
		name[4]=4;
		System.out.println();
		
		}
		catch(ArrayStoreException e){
			System.out.println(e);
		}
	
	}

}
