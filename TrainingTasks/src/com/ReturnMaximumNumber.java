package com;

/*
 Given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
Input: num = 9669
Output: 9969
 */


public class ReturnMaximumNumber {

	public static void main(String[] args) {
		
	String num="9669";
		String first="9669";
	    String	second="9669";
		String third="9669";
		String fourth="9669";
		int numOfDigits=4;
		
		
		for(int i=0;i<=numOfDigits;i++)
		{
			if(first.charAt(0)=='9')
			{
				first=first.replaceFirst("9", "6");
			}
			else if(first.charAt(0)=='6')
			{
				first=first.replaceFirst("6", "9");
			}
			if(second.charAt(0)=='9')
			{
				first=first.replaceFirst("9", "6");
			}
			else if(first.charAt(0)=='6')
			{
				first=first.replaceFirst("6", "9");
			}
		}
		
		
		
		System.out.println(first);
		
		/*for(int i=0;i<=num;i++)
		{
			if(num[i]==6) {
				
			}
			
		}*/
		
		

		

	}

}
