package main.java.logical;

import main.java.utility.*;

public class CouponNumber {

	public static int couponNumber(int[] arr)
	{
		int count=0;
		int hit=0;
		int random=0;
		while(hit < arr.length)
		{
			random=Utility.getRandomInt(100);
			count++;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==random)
				{
					hit++;
				}
			}
		}
		return count;
	}

	
	
	public static void main(String[] args) {
		System.out.println("enter the number of coupon you want : ");
		int length = InputScanner.readInt();
		int[] arr=new int[length];
		System.out.println("enter the coupon number ");
		Utility.enterDistinctArrayInt(arr);
		System.out.println(couponNumber(arr));
		
	}

}
