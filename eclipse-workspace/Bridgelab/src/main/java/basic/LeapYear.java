package main.java.basic;

import java.util.InputMismatchException;

import main.java.utility.*;
public class LeapYear {
	
	public static boolean isLeapYear(int year)
	{
		if(year<1000 || year>9999)
		{
			System.out.println("year should be of four digits ");
			return false;
		}
		return (year%400==0 || (year%4==0 && year%100!=0));
	}
	

	public static void main(String[] args) {
		int year=0;
		System.out.println("enter the year : ");
		
		try {
			   year=InputScanner.readInt();
			}
			catch(InputMismatchException e) {
				System.out.println("invalid number entry try again!!!");
				System.exit(0);
			}
		
		//check if year is of 4 digits
		
		if(isLeapYear(year))
		{
			System.out.println(" is a leap year ");
		}
		else
		{
			System.out.println(" is not a leap year ");
		}
		
	}
}
