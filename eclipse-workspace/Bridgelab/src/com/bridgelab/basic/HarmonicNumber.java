package com.bridgelab.basic;

import com.bridgelab.utility.Utility;

public class HarmonicNumber {
	
	public static double getHarmonicProgression(int n)
	{
		int i=1;
		double hp=0.0;
		while(i<=n)
		{
			hp=hp+(1.0/(double)i);
			i++;
		}
		return hp;
	}
	

	public static void main(String[] args) {
		System.out.println("enter the number for harmonic progression");
		int n = Utility.readInt();
		if(n==0)
		{
			System.out.println("cannot be zero ");
			return;
		}
		
		double hp = getHarmonicProgression(n);
		System.out.println("hamonic progression is : "+hp);
		
		Utility.closeScanner();
	}

}
