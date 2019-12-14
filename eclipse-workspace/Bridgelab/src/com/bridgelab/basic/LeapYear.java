package com.bridgelab.basic;

import com.bridgelab.utility.Utility;

public class LeapYear {
	
	public static boolean isLeapYear(int year)
	{
		return (year%400==0 || (year%4==0 && year%100!=0));
	}
	

	public static void main(String[] args) {
		System.out.println("enter the year : ");
		int year=Utility.readInt();
		
		//check if year is of 4 digits
		if(year<1000 || year>9999)
		{
			System.out.println("year should be of four digits ");
			return;
		}
		
		if(isLeapYear(year))
		{
			System.out.println(" is a leap year ");
		}
		else
		{
			System.out.println(" is not a leap year ");
		}
		Utility.closeScanner();
	}
}
