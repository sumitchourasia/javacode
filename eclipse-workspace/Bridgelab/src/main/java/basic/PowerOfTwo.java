package main.java.basic;

import java.util.InputMismatchException;

import main.java.utility.*;

public class PowerOfTwo {

	public static int getPowerOfTwo(int n)
	{
		int pow=1;
		if(n<=0||n>30)
		{
			System.out.println("n should be in range 1 to 30");
			if(n==0)
				return 1;
			
			return -1;
		}
		else
		{
		for(int i=0;i<n;i++)
		{
			pow=pow*2;
			System.out.println(pow);
		}
		}
		return pow;
	}
	
	public static void main(String[] args) {
		int n=0;
		System.out.println("enter the n for finding power");
		
		try {
			   n=InputScanner.readInt();
			}
			catch(InputMismatchException e) {
				System.out.println("invalid number entry try again!!!");
				System.exit(0);
			}
		
		getPowerOfTwo(n);
	}

}
