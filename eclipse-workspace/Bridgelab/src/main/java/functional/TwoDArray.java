package main.java.functional;

import main.java.utility.*;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TwoDArray {
	
	public static void printwriterInt2DArray(int[][] arr)
	{
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out) );
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				pw.print(arr[i][j]+" ");
				pw.flush();
			}
			pw.println(" ");
		}
		pw.close();
	}
	
	public static void printwriterDouble2DArray(double [][] arr)
	{
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out) );
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				pw.print(arr[i][j]+" ");
				pw.flush();
			}
			pw.println(" ");
		}
		
		pw.close();
	}
	
	
	public static void printwriterBoolean2DArray(boolean [][] arr)
	{
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out) );
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				pw.print(arr[i][j]+" ");
				pw.flush();
			}
			pw.println(" ");
		}
		
		pw.close();
	}
	
	
	public static void main(String[] args) {

		System.out.println("enter \n 1 for integer array \n 2 for double array \n 3 for boolean array");
		int k=InputScanner.readInt();
		
		System.out.println("enter the length and breadth of array : ");
		int i=InputScanner.readInt();
		
		int j=InputScanner.readInt();
		
		System.out.println("enter the data");
		switch (k)
		{
			case 1:
			{
				int [][] arrint=new int[i][j];
				Utility.enter2DArrayInt(arrint, i, j);
				printwriterInt2DArray(arrint);
				break;
			}
			case 2:
			{
				double [][] arrdouble=new double[i][j];
				Utility.enter2DArrayDouble(arrdouble, i, j);
				printwriterDouble2DArray(arrdouble);
				break;
			}
			case 3:
			{
				boolean [][] arrboolean=new boolean[i][j];
				Utility.enter2DArrayBoolean(arrboolean, i, j);
				printwriterBoolean2DArray(arrboolean);
				break;
			}
			default :
			{
				System.out.println("invalid selection");
				return;
			}
		}//switch
		
	}//main
		
}//class
