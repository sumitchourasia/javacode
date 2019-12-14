package com.bridgelab.basic;

import com.bridgelab.utility.Utility;

public class PowerOfTwo {

	public static void getPowerOfTwo(int n)
	{
		int pow=1;
		
		for(int i=0;i<n;i++)
		{
			pow=pow*2;
			System.out.println(pow);
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("enter the n for finding power");
		int n=Utility.readInt();
		if(n<=0||n>30)
		{
			System.out.println("n should be in range 1 to 30");
			return ;
		}
		getPowerOfTwo(n);
		
		Utility.closeScanner();
		
	}

}
