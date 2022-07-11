package com.assignment;

import java.util.Scanner;

public class Solution {
	int quotient = 0;

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter num1");
		int divident=scan.nextInt();
		System.out.println("enter num2");
		int divisor = scan.nextInt();
		Solution sol=new Solution();
		System.out.println(sol.result(divident,divisor));
	}
 int result(int divident, int divisor) {
	 int sign= ((divident < 0) ^ (divisor < 0)) ? -1 : 1;
		
		while(divident>=divisor) {
			
			divident=divident-divisor;
			quotient++;
		}
		 if (sign == -1)
	            quotient = -quotient;
	 
	        return quotient;
		
	
	}


	
	
}
