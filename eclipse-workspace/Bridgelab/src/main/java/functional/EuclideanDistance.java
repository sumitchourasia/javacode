package main.java.functional;

import java.util.InputMismatchException;

import main.java.utility.*;

public class EuclideanDistance {
	
	public static double findEuclideanDistance(int x1,int y1,int x2,int y2)
	{
		double distance= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		return distance;
	}

	public static void main(String[] args) {
		int x1=0;
		int y1=0;
		int x2=0;
		int y2=0;
		System.out.println("euclidean distance");
		System.out.println("enter the value of X1 and Y1 : ");
		
		try {
		    x1=InputScanner.readInt();
		    y1=InputScanner.readInt();
			System.out.println("enter the value of X1 and Y1 : ");
			x2=InputScanner.readInt();
			y2=InputScanner.readInt();
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("not a number !!!");
			System.exit(0);
		}

		double distance=findEuclideanDistance(x1,y1,x2,y2);
		System.out.println("euclidean distance is : "+distance);

	}
}




