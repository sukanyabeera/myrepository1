package library;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		KidUsers ku=new KidUsers();
		ku.age=11;
		ku.bookType="the little prince";
		ku.registerAccount();
		ku.requestBook();
		
	    System.out.println();
	    
		AdultUsers au=new AdultUsers();
		au.age=13;
		au.bookType="jane Eyre";
		au.registerAccount();
		au.requestBook();
		
		
		
		/*Scanner scan=new Scanner(System.in);
        System.out.println("enter the age");
		KidUsers lu=new KidUsers();
		lu.bookType="the little princes";
		lu.age=scan.nextInt();
		
		lu.registerAccount();
		 */
		
		
	
	}

}
