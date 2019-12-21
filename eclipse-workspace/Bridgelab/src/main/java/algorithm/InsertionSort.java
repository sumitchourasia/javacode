package main.java.algorithm;

import main.java.utility.*;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		System.out.println("enter the length of array : ");	
		int length=InputScanner.readInt();
		
		int[] arr=new int[length];
		
		System.out.println("enter the array data : ");
		Utility.enterArrayInt(arr);
		
		Utility.insertionSort(arr);
		
		Utility.printArray(arr);
		
		
	}

}
