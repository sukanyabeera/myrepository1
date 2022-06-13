package com.motivity;

public class Patient {

	public void appointment()
	{
		System.out.println( "1.general checkup 2.dental checkup");
	}
	
	void consultation(String checkup)
	{
		System.out.println("want to consult "+checkup);
		
	}
	
	String consultDoctor()
	{
	  return "consult Doctor Ritu";
	}
	
	String consultaionFee(int fee)
	{
		System.out.println("consultation fee "+ fee);
		return "payment done";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Patient raju =new Patient();
		raju.appointment();
		raju.consultation("dentist");
		System.out.println(raju.consultDoctor());
		System.out.println(raju.consultaionFee(500));
		
	}

}
