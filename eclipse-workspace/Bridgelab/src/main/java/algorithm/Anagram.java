package main.java.algorithm;

import java.util.Arrays;

import main.java.utility.InputScanner;

public class Anagram {

	public static boolean checkAnagram(String str1,String str2)
	{	
		boolean flag=false;
		
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			boolean[] arr=new boolean[str1.length()];
			//System.out.println(Arrays.toString(arr));
			for(int i=0;i<str1.length();i++)
			{
				System.out.println(Arrays.toString(arr));
				flag=false;
				
					for(int j=0;j<str2.length();j++)
					{
						System.out.println(str1.charAt(i)+" and "+str2.charAt(j));
						if(str1.charAt(i)==str2.charAt(j)) {
							flag=true;
							break;
						}
					}
					if(flag==true)
					{
						arr[i]=true;
					}
					else
					{
						return false;
					}
			 }
			for(int k=0;k<arr.length;k++)
			{
				
				if(arr[k]==false)
				{
					return false;
				}
			}
			
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("enter the strings to compare : ");
		String str1=InputScanner.readString();
		String str2=InputScanner.readString();
		
		boolean flag=checkAnagram(str1,str2);
		
		System.out.println(" is anagram : "+flag);
		
	}

}
