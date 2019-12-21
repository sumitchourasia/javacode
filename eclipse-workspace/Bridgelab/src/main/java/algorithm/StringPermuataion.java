package main.java.algorithm;

import java.util.Arrays;

import main.java.utility.*;

public class StringPermuataion {
	
	public static void getPermutation(String string)
	{
		char[] charray=new char[string.length()];
		int[] count=new int[charray.length];
		char result[]=new char[string.length()];
		
		for(int i=0;i<charray.length;i++)
		{
			charray[i]=string.charAt(i);
			count[i]++;
		}
		//System.out.println(Arrays.toString(charray));

		permute(charray, count, result, 0);
	}
	
	public static void permute(char[] charray,int[] count,char[] result,int level)
	{
			if(level==charray.length)
			{
				printString(result);
				return;
			}
			
			for(int i=0;i<charray.length;i++)
			{
				//System.out.println(i);
				if(count[i]==0)
				{
					continue;
				}
				result[level]=charray[i];
				count[i]--;
				permute(charray, count, result, level+1);
				count[i]++;
		     }
	 }
	
	
	public static void printString(char[] result)
	{
			System.out.println(Arrays.toString(result));
	}
	
	public static void main(String[] args) {
		System.out.print("enter the string : ");
		String string=InputScanner.readString();
		
		getPermutation(string);
	}

}
