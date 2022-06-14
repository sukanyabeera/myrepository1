package railways;

import java.util.Random;


public class TsetCompartment {

	public static void main(String[] args)
	{
		
		System.out.println(getObject().notice());
	
	      
	}
	static Compartment getObject()
	{
		Object[] obj= {new FirstClass(),new Ganeral(),new Ladies(),new Luggage()};
		Random random=new Random();
		return (Compartment) obj[random.nextInt(4)];
		
		
	}

}
