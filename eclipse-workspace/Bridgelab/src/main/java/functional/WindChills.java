package main.java.functional;

import main.java.utility.*;

public class WindChills {
	
	
	public static double calculateWindChills(double t,double v)
	{
		double windchills=(35.74 + (0.6215*t) + (((0.4275*t) - 35.75)*Math.pow(v,0.16)));
		
		return windchills;
	}
	

	public static void main(String[] args) {
		System.out.println("enter t and v values : ");
		double t=InputScanner.readDouble();
			
		double v=InputScanner.readDouble();
		
		if(t>50||v>120||v<3)
			return;
		
		double windchills=calculateWindChills(t,v);
		
		System.out.println(windchills);
		
	}

}
