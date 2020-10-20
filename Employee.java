package com.Employee;

public class Employee {

	public static void main(String[] args) 
	{
		System.out.println("******Welocme to Employee Wages Problem*******");
//EMPLOYEE IS PRESNT OR NOT USE CASE 1
		int Is_Full_Time=1;
		int EmpRate_Hour=20;
		int EmpHrs=8;
		int Salary=0;
		
		
		
		int EmpCheck = (int) (Math.floor(Math.random() *10 % 2));
		if (EmpCheck==Is_Full_Time)
		{
			
			Salary=(EmpHrs*EmpRate_Hour);
			System.out.println("Employee Is Present and Salary is: " +Salary);
				
		}
		else
		{
			System.out.println("Employee Is Not Present and Salary is :" +Salary);
		
		} //Else Block Over
		

		
	}

}
