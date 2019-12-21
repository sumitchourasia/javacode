package main.java.junit;

import main.java.utility.*;

public class MonthlyPayment {

	public static double calculateMonthlyPayment(double P , double Y , double R)
	{
		
		double n = 12*Y;
		double r=R/12*100;
		
		double payment= ( P*r )/(1.0-Math.pow((1+r), (-n)));
		
		double mp=payment/12;
		return mp;
		
	}
	
	public static void main(String[] args) {
		System.out.println("enter the principle amount : ");
		int principle=InputScanner.readInt();
		System.out.println("enter the years : ");
		int years=InputScanner.readInt();
		System.out.println("enter the rate of interest : ");
		int rate=InputScanner.readInt();
		
		double mp=calculateMonthlyPayment(principle,years,rate);
		System.out.printf("monthly payment is : "+mp);
		
	}

}
