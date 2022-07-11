package com.assignment;

class Employee {
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	
	public void getEmployeeDetails( int empId,String empName,String email,String gender,float salary  )
	{
		this.empId=empId;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	/*	System.out.println("empId : "+empId);
		System.out.println("empName : "+empName);
		System.out.println("email : "+email);
		System.out.println("gender : "+gender);
		System.out.println("salary : "+salary);  
	*/
	}
}

class EmployeeDB{
	
	
	
	
}

public class Test1 {

	public static void main (String[] args) {

			Employee employee=new Employee();
			employee.getEmployeeDetails(420,"shiny","shiny@gmail.com","Female",50000);
	}

}
