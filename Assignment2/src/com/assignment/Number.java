package com.assignment;

public class Number {

	
	public static void main(String args[]) {
	    int num = 20;
	 
	    System.out.println(num + " in binary: " +
	                       Integer.toBinaryString(num));
	 
	    System.out.println(num + " in octal: " +
	                       Integer.toOctalString(num));
	 
	    System.out.println(num + " in hexadecimal: " +
	                       Integer.toHexString(num));
	  }
}
