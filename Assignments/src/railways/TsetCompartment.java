package railways;

import java.util.Random;


public class TsetCompartment {

	public static void main(String[] args) {
		
	
		Compartment[] compartments = new Compartment[10];

		Random random = new Random();
		
	    	for (int i = 0; i < 10; i++) {
	    		int randomNum = random.nextInt((4 - 1) + 1) + 1;
	    	
	    		if (randomNum == 1)
	    			compartments[i] = new Luggage();
	    		else if (randomNum == 2)
	    			compartments[i] = new Ladies();
	    		else if (randomNum == 3)
	    			compartments[i] = new Ganeral();
	    		else if (randomNum == 4)
	    			compartments[i] = new FirstClass();
	    	
	    		System.out.println(compartments[i].notice());
	        
	      
	      
	      
	}

}
}