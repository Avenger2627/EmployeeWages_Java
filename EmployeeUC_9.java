package com.Employee;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class EmployeeUC_9 
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME=2;
	public static void main(String[] args) {
	EmployeeUC_9 ew=new EmployeeUC_9();
	ew.WagesCalculation("Telco", 20);
	ew.WagesCalculation("Tata", 40);
	ew.WagesCalculation("Sungard", 60);
	ew.WagesCalculation("IBM", 80);
}
public void WagesCalculation(String company,int Wages_Per_Hour )
{
			
			
		int EmpHrs=8;
		int Part_Day_Hour=4;
		int days=20;
		int workingDays=1;
		int workingHour=0;
		int totalWages=0;
		while (workingDays <= days && workingHour <100 ) 
		{
			int checkout=(int) (Math.floor(Math.random() *10) %2+1);
			switch(checkout)
			{
				case  IS_FULL_TIME:int total=  Wages_Per_Hour * EmpHrs;
							workingHour=workingHour+EmpHrs;
							totalWages=totalWages+total;
				break;
				case IS_PART_TIME :int total1= Wages_Per_Hour * Part_Day_Hour;
							workingHour=workingHour + Part_Day_Hour;
							totalWages=totalWages+total1;
				break;
				default : System.out.println("0");
			}
				workingDays++;					
		}
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(company, totalWages);
		for (String i : map.keySet()) 
		{
		      System.out.println( i + " wages in month " + map.get(i));
		}
}

}