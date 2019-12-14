package com.bridgelab.functional;

import com.bridgelab.utility.Utility;

public class EuclideanDistance {
	
	public static double findEuclideanDistance(int x,int y)
	{
		double distance= Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		
		return distance;
	}

	public static void main(String[] args) {
		System.out.println("euclidean distance");
		System.out.println("enter the value of X and Y : ");
		int x=Utility.readInt();
		int y=Utility.readInt();

		double distance=findEuclideanDistance(x,y);
		System.out.println("euclidean distance is : "+distance);

		Utility.closeScanner();
	}
}

