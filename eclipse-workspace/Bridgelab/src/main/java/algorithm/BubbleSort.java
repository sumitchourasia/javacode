package main.java.algorithm;

import main.java.utility.*;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("enter the length of array");
		int length=InputScanner.readInt();
		int[] arr=new int[length];
		
		Utility.enterArrayInt(arr);
		
		Utility.doBubbleSort(arr);
		
		Utility.printArray(arr);
		
		
	}

}



