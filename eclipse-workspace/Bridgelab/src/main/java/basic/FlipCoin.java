package main.java.basic;

import java.util.InputMismatchException;

import main.java.utility.*;

public class FlipCoin {
	
	public static double headPercentage(int n)
	{
		double random=0.0;
		int head=0;
		if(n<=0)
		{
			System.out.println("invalid data");
			return 0.0;
		}
		else
		{
		for(int i=0;i<n;i++) {
			random=Utility.getRandomDouble();
			if(random>0.5)
			{
				head++;
			}
		}
		}
		
		double perc = ((double)head/n)*100;
		
		return perc;
	}

	public static void main(String[] args) {
		int n=0;
		System.out.print("enter the number of times to flip the coin : ");
		try {
		   n=InputScanner.readInt();
		}
		catch(InputMismatchException e) {
			System.out.println("invalid number entry try again!!!");
			System.exit(0);
		}
		
		double headperc =headPercentage(n);
		double tailperc = 100.0-headperc;
		System.out.println("Heads percentage is : "+headperc+" \n tail percentage is : "+tailperc);
	}

}



