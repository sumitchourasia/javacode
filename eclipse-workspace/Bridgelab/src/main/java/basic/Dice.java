package main.java.basic;

import java.util.InputMismatchException;
import java.util.Random;
import main.java.utility.*;

public class Dice {
	
	public static int dice(int val,int n)
	{
		Random rd=new Random();
		int count=0;
		if(val<1 || val>7 || n<1)
		{
			System.out.println("not a valid choice !!!");
			return 0;
		}
			
		for(int i=1;i<=n;i++)
		{
			int var=1+rd.nextInt(6);
			//System.out.println("random number : "+var);
			if(var==val)
			{
				count++;
			}
		}
		System.out.println("number of times "+ val +" appeared is : "+count);
		return count;
	}

	
	public static void main(String[] args) {
		int val=0;
		int n=0;
		System.out.println("enter the number to compare : ");
		try {
		    val=InputScanner.readInt();
		}
		catch(NumberFormatException e)
		{
			System.out.println("not a number !!!");
			System.exit(0);
		}
		
		System.out.println("enter number of times to run : ");
		try {
		    n=InputScanner.readInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("not a number !!!");
			System.exit(0);
		}
		  
		dice(val,n);
		
	}

}
