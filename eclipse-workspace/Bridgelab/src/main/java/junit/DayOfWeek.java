package main.java.junit;

import main.java.utility.*;
/*
To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the week that date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
*/

public class DayOfWeek {
	
	public static void calculateDayOfWeek(int d,int m,int y)
	{
		int d0=0;
		int m0=0;
		int y0=0;
		int x=0;
		
		y0=y-(14-m)/12;
		
		x=y0 + (y0/4) - (y0/100) + (y0/400);
		
		m0 = m + 12 * ((14 - m) / 12) - 2;
		
		d0 = (d + x + (31 * m0) / 12) % 7;
		
		switch(d0)
		{
		case 0:
		{
			System.out.println("sunday");
			break;
		}
		case 1:
		{
			System.out.println("Monday");
			break;
		}
		case 2:
		{
			System.out.println("tuesday");
			break;
		}
		case 3:
		{
			System.out.println("wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thursday");
			break;
		}
		case 5:
		{
			System.out.println("friday");
			break;
		}
		case 6:
		{
			System.out.println("saturday");
			break;
		}
	    default : 
	    System.out.println("error");
		}
	}

	
	public static void main(String[] args) {
		
		System.out.print("enter the date : ");
		int date=InputScanner.readInt();
		
		System.out.print("enter the month : ");
		int month=InputScanner.readInt();
		
		System.out.print("enter the year : ");
		int year=InputScanner.readInt();
		
		calculateDayOfWeek(date,month,year);
		
		
	}
}


