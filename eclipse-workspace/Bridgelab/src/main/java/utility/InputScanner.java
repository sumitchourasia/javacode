package main.java.utility;

import java.util.Scanner;

public class InputScanner {
	private static final Scanner SC = new Scanner(System.in);

	public static int readInt() {
		return SC.nextInt();
	}

	public static double readDouble() {
		return SC.nextDouble();
	}

	public static String readString() {
		 
		return SC.next();
	}

	public static boolean readBoolean() {
		return SC.nextBoolean();
	}
	
	public static String nextLine()
	{	
		return SC.nextLine();
	}

}
