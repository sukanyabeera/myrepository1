package com.Exceptions;

public class HandleArrayindecxOutOfBounds {

	public static void main(String[] args) {
		
		String[] furniture=new String[]{"dinning table","chair","canopy","almira","cupboards"};
		int numberOfFurniture=furniture.length;
        
		 for(int i=0; i<= numberOfFurniture; i++)
			{
			 try {
					System.out.println(furniture[5]);
			 }
			 catch(ArrayIndexOutOfBoundsException e){
				 System.out.println(e);
				 System.out.println("please select the correct option");
			 }
			 finally {
				 System.out.println("thankyou!");
			 }
			
			}
	}

}
