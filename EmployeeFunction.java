package com.Employee;

public class EmployeeFunction 
{

	int Is_Present=1;
	int Salary=0;
	int Is_Part_Time=0;
	int Is_Full_Time=1;
	int EmpRate_Hour=20;
	int EmpHrs=8;
	int Part_Time_Hr=4;

	int EmpCheck = (int) (Math.floor(Math.random() *10 % 2));
	public static void main(String[] args)
	{
		System.out.println("******Welocme to Employee Wages Problem*******");		
		EmployeeFunction emp = new EmployeeFunction();
	//Creating Object
		emp.EmpCheck();
		emp.EmpDailyWages();	
	}
	
	public void EmpCheck() // Use Case 1
	{	
		if (EmpCheck == Is_Present)
		{
			if (EmpCheck == Is_Full_Time)
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
	}//C1
	
	public void EmpDailyWages()//Use CAse 2
	{
			if (EmpCheck==Is_Full_Time)
			{
				
				Salary=(EmpHrs*EmpRate_Hour);
				System.out.println("Employee Is Present and Salary is: " +Salary);
					
			}
			else
			{
				System.out.println("Employee Is Not Present and Salary is :" +Salary);		
			} //Else Block Over
		}//2

}//Class
