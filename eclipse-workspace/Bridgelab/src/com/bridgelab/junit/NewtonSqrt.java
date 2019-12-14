package com.bridgelab.junit;

import com.bridgelab.utility.Utility;

public class NewtonSqrt {
	
	public static final double epsilon=1e-15;
	
	public static double calculateNewtonSqrt(double c)
	{
		double t=c;
		
		while(Math.abs(t - c/t) > epsilon*t)
		{
			t=((c/t)+t)/2;
		}
		
		return t;
	}
	

	public static void main(String[] args) {
		System.out.println("enter the number : ");
		int c=Utility.readInt();
		
		if(c<0)
		{
			System.out.println("enter nonnegative number");
		}
		
		double t=calculateNewtonSqrt((double)c);
		
		System.out.printf(" %.3f ",t);
		
	}

}
