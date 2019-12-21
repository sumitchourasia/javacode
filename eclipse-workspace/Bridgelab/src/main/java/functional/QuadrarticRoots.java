package main.java.functional;

import main.java.utility.*;

public class QuadrarticRoots {

	public static double[] calculateQuadraticRoots(int a,int b,int c) {
		double[] arr=new double[2];
		double temp = (Math.pow(b,2) - 4*a*c);

		if(temp<0)
		{
			System.out.println("complex roots");
			return arr;
		}
		double delta= Math.sqrt(temp);
		double root1=(-b+delta)/2;
		double root2=(-b-delta)/2;
		System.out.println(" root1 = "+root1 +" root2 = "+root2);
		
		arr[0]=root1;
		arr[1]=root2;
		return arr;
	}
	
	
	public static void main(String[] args) {
		System.out.println("enter the coefficient a b and c : ");
		int a = InputScanner.readInt();
		int b = InputScanner.readInt();
		int c = InputScanner.readInt();
		
		calculateQuadraticRoots(a,b,c);
	}
}
