package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class QuadrarticRoots {
	
	public static void calculateQuadraticRoots(int a,int b,int c) {
		double temp = (Math.pow(b,2) - 4*a*c);
		if(temp<0)
		{
			System.out.println("complex roots");
			return;
		}
		double delta= Math.sqrt(temp);
		double root1=(-b+delta)/2;
		double root2=(-b-delta)/2;
		System.out.println(" root1 = "+root1 +" root2 = "+root2);
	}
	

	public static void main(String[] args) {
		System.out.println("enter the coefficient a b and c : ");
		int a = Utility.readInt();
		int b = Utility.readInt();
		int c = Utility.readInt();
		
		calculateQuadraticRoots(a,b,c);
		
		Utility.closeScanner();
	}

}
