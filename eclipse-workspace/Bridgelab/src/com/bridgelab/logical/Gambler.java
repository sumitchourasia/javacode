package com.bridgelab.logical;

import com.bridgelab.utility.Utility;

public class Gambler {
	
	public static void playGambler(int n) {
		int totalbets=0;
		int win=0;
		int stock=0;
		int goal=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the stock : ");
			stock=Utility.readInt();
			System.out.print("enter the Goal : ");
			goal=Utility.readInt();
			
			while(stock!=0 && win!=goal )
			{
		             System.out.print("enter your choice : ");
					 int choice=Utility.readInt();
					 
					 int random=Utility.getRandomInt(5);
					 System.out.println("random number : "+random);
					 
					 totalbets++;
					 
					 if(random==choice)
					 {
						 win++;
						 stock++;
					 }
					 else
					 {
						 stock--;
					 }
			 }
		}
		System.out.println("total number of bets : "+totalbets);
		System.out.println("total number of win : "+win);
	}
	
	public static void main(String[] args) {
		System.out.print("enter the number of times to perform the experiment : ");
		int n=Utility.readInt();
		
		playGambler(n);
		
		Utility.closeScanner();
	}

}

