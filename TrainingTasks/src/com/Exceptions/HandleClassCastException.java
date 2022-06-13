package com.Exceptions;

public class HandleClassCastException {

	public static void main(String[] args) {
		
		Object obj=new Double(100);
		try {
			System.out.println((String)obj);
			
		}
		catch(ClassCastException e)
		{
			System.out.println(e);
		}
	}

}
