package main.java.basic;

import main.java.utility.*;
import java.util.InputMismatchException;

public class HarmonicNumber {
	
	public static double getHarmonicProgression(int n)
	{
			double hp=0.0;
			int i=1;
			if(n<1 )
			{
				System.out.println("cannot be less than one or decimal");
				return 0.0;
			}
			while(i<=n)
			{
				hp=hp+(1/(double)i);
				i++;
			}
			return hp;
	 }
	

	public static void main(String[] args) {
		System.out.println("enter the number for harmonic progression");
		int n =0;
		
		try {
		    n =InputScanner.readInt();
		}
		catch(InputMismatchException e) {
			System.out.println("cannot be decimal");
		}
		
		if(n<1 || n!=(long)n)
		{
			System.out.println("cannot be less than one or decimal");
			return ;
		}
		double hp = getHarmonicProgression(n);
		System.out.println("harmonic progression is : "+hp);
		
	}

}
