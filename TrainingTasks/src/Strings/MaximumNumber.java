package Strings;

import java.util.Stack;

public class MaximumNumber {
	
	 public static void main(String[] args) {
	        System.out.println("Return the max num:"+maxNumber(9966));
	    }
	    public static int maxNumber(int number) {
	        Stack<Integer> ob = new Stack<Integer>();
	        int numberLength = 0;
	        while(number > 0)
	        {
	            ob.push(number % 10);
	            number /= 10;
	            numberLength++;
	        }

	        boolean changedFirstOccurrence = false;
	        int maxNumber = 0;
	        for(int i = numberLength; i > 0; i--)
	        {
	            int numberToAdd = ob.pop();
	            if (numberToAdd == 6 && !changedFirstOccurrence)
	         { 
	                numberToAdd = 9;
	                changedFirstOccurrence = true;
	         }
	            maxNumber += numberToAdd * (int) Math.pow(10, i);
	        }
	        return maxNumber / 10;
	    }

}
