package com.Employee;

public class Employee 
{
	public static void main(String[] args) 
	{
		System.out.println("******Welocme to Employee Wages Problem*******");
		
		int Is_Present=1;
		int Salary=0;
		int Is_Part_Time=0;
		int Is_Full_Time=1;
		int EmpRate_Hour=20;
		int EmpHrs=8;
		int Part_Time_Hr=4;
		
//Genrating Random Number
		int EmpCheck = (int) (Math.floor(Math.random() *10 % 2));
		int EmpCheckT = (int) (Math.floor(Math.random() *10 % 2));
//Checking Employee And Caluclating Wages
		if (EmpCheck == Is_Present)
		{
			if (EmpCheckT == Is_Full_Time)
			{
				Salary=EmpHrs*EmpRate_Hour;
				System.out.println("Employee Is Present and Salary is: " +Salary);
				
			}
							
			else
			{
				Is_Part_Time=EmpRate_Hour*Part_Time_Hr;
				System.out.println("Employee Is Present and Salary is: " +Is_Part_Time);
					
			} //Else Block Over
		
		}
		else
		{
			System.out.println("Employee Is Absent & Salary is :" +Salary);
		}

	} //Public

}// MAin Class
