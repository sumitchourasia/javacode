package com.bridgelab.basic;

import com.bridgelab.utility.Utility;

public class PrimeFactors {
	
	public static void findPrimeFactors(int n)
	{
		boolean flag=false;
		int i=2;
		while(i<=n/2)  
		{
			flag=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=true;
				}
			}
			
			if(flag!=true && n%i==0)
			System.out.print(i+" ");
			
			i++;
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println("enter the number for prime factor");
		int n=Utility.readInt();
		if(n<=0)
		{
			System.out.println("n should be positive");
			return ;
		}
		
		findPrimeFactors(n);
		
		Utility.closeScanner();
	}

}