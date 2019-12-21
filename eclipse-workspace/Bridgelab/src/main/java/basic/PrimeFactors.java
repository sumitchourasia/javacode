package main.java.basic;

import java.util.Arrays;
import java.util.InputMismatchException;

import main.java.utility.*;

public class PrimeFactors {
	
	public static int[] findPrimeFactors(int n)
	{
		int[] arr=new int[5];
		boolean flag=false;
		int i=2;
		
		if(n<=0)
		{
			System.out.println("n should be positive");
			return null;
		}
		else
		{
			int  k=0;
			while(i<=n) //check only till half 
			{
				
				flag=false;
				for(int j=2;j<i;j++)  //check if the divisor itself has any factor  
				{
					if(i%j==0 )
					{
						flag=true;
					}
				}
				
				if(flag!=true && n%i==0) //if the divisor does not have any factor
				{	
					if(k<5)                     //and the number is divisible by i
						arr[k++]=i;
				
					System.out.print(i+" ");
				}
				i++;
			 }
		 }
		//System.out.println(Arrays.toString(arr));
		return arr;
	}

	
	public static void main(String[] args) {
		int n=0;
		System.out.println("enter the number for prime factor");

		try {
			   n=InputScanner.readInt();
			}
			catch(InputMismatchException e) {
				System.out.println("invalid number entry try again!!!");
				System.exit(0);
			}
		
		System.out.println(Arrays.toString(findPrimeFactors(n)));
		
	}

}
