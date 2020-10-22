package com.Employee;

public class Employee 
{
	public static void main(String[] args) 
	{
		System.out.println("******Welocme to Employee Wages Problem*******");
		
		//int Is_Present=1;
		int fullTimeDays = 0;
		int partTimeDays = 0;
		int perHour = 20;
		int FullDayHour = 8;
		int WorkingDayMonth = 20;
		int maxHoursInMonth = 100;
		int totalempHour = 0;
		int totalWorkingDay = 0;
		int absent = 0;
		int i = 0;

		
//Genrating Random Number
		while (maxHoursInMonth > totalempHour && WorkingDayMonth > totalWorkingDay) 
		{

					++totalWorkingDay;
				int EmpCheck = (int) (Math.floor(Math.random() *10 % 3));
		//Checking Employee And Caluclating Wages Using Case
				
				switch(EmpCheck)
				{
					case 1:
						fullTimeDays++;
						totalempHour = totalempHour + FullDayHour;
			
					break;
					
					case 2:
						partTimeDays++;
						totalempHour = totalempHour + (FullDayHour / 2);
		
					break;
					
					default:
						absent++;
						
					break;
					
				}	//Switch Case
			}//While

		int FullTimeSalary = perHour * (FullDayHour * fullTimeDays);
		int PartTimeSalary = (partTimeDays * (FullDayHour / 2)) * perHour;

		System.out.println("*******Employee_Wages********");
		System.out.println("FullTime_Days_in_month: \t" + fullTimeDays);
		System.out.println("PartTime_Days_in_month: \t" + partTimeDays);
		System.out.println("Absent_Days_in_month: \t" + absent);
		System.out.println("Total_working_Days_IN_month : \t" + (fullTimeDays + partTimeDays));
		System.out.println("Total_Hours    :\t\t" + totalempHour);
		System.out.println("FullTime_Salary:\t\t " + FullTimeSalary);
		System.out.println("PartTime_Salary:\t\t " + PartTimeSalary);
		System.out.println("Total_Salary   :\t\t " + (FullTimeSalary + PartTimeSalary));
		System.out.println("---------------------------------------");

	} //Public

}// MAin Class
