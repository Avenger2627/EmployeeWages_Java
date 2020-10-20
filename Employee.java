package com.Employee;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) 
	{
		System.out.println("******Welocme to Employee Wages Problem*******");
//EMPLOYEE IS PRESNT OR NOT USE CASE 1
		int Is_Full_Time=1;
		int EmpCheck = (int) (Math.floor(Math.random() *10 % 2));
		System.out.println(EmpCheck);
		if (EmpCheck==Is_Full_Time)
		{
			System.out.println("Employee Is Present");
		}
		else
		{
			System.out.println("Employee Is Not Present");
		} //Else Block Over
		

		
	}

}
