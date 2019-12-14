package com.bridgelab.algorithm;

import com.bridgelab.utility.Utility;

public class PrimeNumber1000 {

	public static void findPrimeInRange(int range)
	{
		boolean isPrime=false;
		for(int i=2;i<=range;i++)
		{
			isPrime=Utility.isPrimeNumber(i);
			if(isPrime==true)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		int range=1000;
		System.out.println("total prime numbers between 0 to 1000 are : ");
		
		findPrimeInRange(range);
		
	}

}
