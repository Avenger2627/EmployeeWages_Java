package com.Employee;

public class Employee 
{
	public static void main(String[] args) 
	{
		System.out.println("******Welocme to Employee Wages Problem*******");
		
		//int Is_Present=1;
		int isFullTime = 1;
		int perHour = 20;
		int FullDayHour = 8;
		int WorkingDayMonth = 20;
		
//Genrating Random Number
		int EmpCheck = (int) (Math.floor(Math.random() *10 % 3));
//Checking Employee And Caluclating Wages Using Case
		
		switch(EmpCheck)
		{
			case 1:
			System.out.println("FullTime_Employee_Wages_Monthly");
			int FullTimeWages = perHour * (FullDayHour * WorkingDayMonth);
			System.out.println("Full_Time_Wages_for " + WorkingDayMonth + " days : " + FullTimeWages + " Rs.");
			break;
		case 2:
			System.out.println("PartTime_Employee_Wages_Monthly");
			int partTimeWages = (WorkingDayMonth * (FullDayHour / 2)) * perHour;
			System.out.println("PartTime_Wages_for " + WorkingDayMonth + " days : " + partTimeWages + " Rs.");
			break;
		default:
			System.out.println("Employee is Absent..!!!!");
			break;
			
		}	//Switch Case
		
	} //Public

}// MAin Class
