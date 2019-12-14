package com.bridgelab.junit;

import com.bridgelab.utility.Utility;

public class VendingMachine {
	
	public static int calculateChange(int amount) {
		
		int notes=0;
		int totalnotes=0;
		int div=1000;
		
		while(amount>0)
		{
			notes=amount/div;
			amount=amount%div;
			totalnotes +=notes;
			
			if(notes>0)
			System.out.println(div+ " rupees notes are : "+notes );
			
			if(div==500 || div==50)
			{
				div=div/5;
			}
			else
				div=div/2;
		}
	return totalnotes;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("ENTER THE AMOUNT : ");
		int amount=Utility.readInt();
		
		calculateChange(amount);
		
		Utility.closeScanner();
		
	}

}
