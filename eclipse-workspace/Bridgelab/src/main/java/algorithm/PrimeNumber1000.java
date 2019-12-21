package main.java.algorithm;

import main.java.utility.*;

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
				isPalindrome(i);
			}
		}
		
	}
	
	
	public static void isPalindrome(int num)
	{
		int n=num;
		int rem=0;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		
		if(rev==num)
		{
			System.out.println("  is palindrome ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int range=1000;
		System.out.println("total prime numbers between 0 to 1000 are : ");
		
		findPrimeInRange(range);
	}
}
