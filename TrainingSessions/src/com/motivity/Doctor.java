package com.motivity;

public class Doctor {
	int id;
	float salary;
	String department;
	static String organisation;
	
	public static void main(String[] args) {

		Doctor ritu=new Doctor();
		
		ritu.id=1024;
		ritu.salary=50000.00f;
		ritu.department="dental";
		Doctor.organisation="NIMS";
	
		System.out.println("id="+ritu.id);
		System.out.println("salry="+ritu.salary);	
		System.out.println("department="+ritu.department);
		System.out.println("organisation="+Doctor.organisation);
	
	}

}
