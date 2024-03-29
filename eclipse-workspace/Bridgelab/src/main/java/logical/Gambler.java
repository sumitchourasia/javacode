package main.java.logical;

import main.java.utility.*;

public class Gambler {
	
	public static void playGambler(int n) {
		int totalbets=0;
		int win=0;
		int stock=0;
		int goal=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the stock : ");
			stock=InputScanner.readInt();
			System.out.print("enter the Goal : ");
			goal=InputScanner.readInt();
			
			while(stock!=0 && win!=goal )
			{
		             System.out.print("enter your choice : ");
					 int choice=InputScanner.readInt();
					 
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
		int n=InputScanner.readInt();
		
		playGambler(n);
		
	}

}

