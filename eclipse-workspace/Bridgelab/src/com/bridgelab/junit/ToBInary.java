package com.bridgelab.junit;

import com.bridgelab.utility.Utility;

public class ToBInary {

	public static void toBinary(int n)
	{
		int[] arr=new int[12];
		int bit=0;
		int i=arr.length-1;
		int count=arr.length-1;
		while(n>0)   
		{
			count--;
			bit=n%2;
			n=n/2;
			arr[i--]=bit;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==1)
			{
				System.out.print((int)Math.pow(2, (arr.length-1-j)));
				if(j!=0)
				System.out.print(" + ");
			}
		}
		
		System.out.println(" ");

		for(int j=count+1;j<arr.length;j++)
		{
			int k=0;
			if(k%4==0)
				System.out.print(" ");
			System.out.print(arr[j]+" ");
		}
		
}

	public static void main(String[] args) {
		
		System.out.println("enter the number : ");
		int n=Utility.readInt();
		
		toBinary(n);
		
		
		
	}

}
