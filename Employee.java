package com.Employee;

public class Employee 
{
	public static void main(String[] args) 
	{
		System.out.println("******Welocme to Employee Wages Problem*******");
		
		//int Is_Present=1;
		int Salary=0;
		int Is_Part_Time=0;
		int Is_Full_Time=1;
		int EmpRate_Hour=20;
		int EmpHrs=8;
		int Part_Time_Hr=4;
		
//Genrating Random Number
		int EmpCheck = (int) (Math.floor(Math.random() *10 % 3));
//Checking Employee And Caluclating Wages Using Case
		
		switch(EmpCheck)
		{
			case 1:
				Salary=EmpHrs*EmpRate_Hour;
				System.out.println("Employee Is Present and Salary is: " +Salary);
			break;
			
			case 2:
				Is_Part_Time=EmpRate_Hour*Part_Time_Hr;
				System.out.println("Employee Is Present and Salary is: " +Is_Part_Time);
			break;
			
			default:
				System.out.println("Employee is Absent and Salary is: " +Salary);
			break;
			
		}	//Switch Case
		
	} //Public

}// MAin Class
