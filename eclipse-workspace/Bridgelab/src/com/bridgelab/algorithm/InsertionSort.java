package com.bridgelab.algorithm;

import com.bridgelab.utility.Utility;

public class InsertionSort {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("enter the length of array : ");	
		int length=Utility.readInt();
		
		int[] arr=new int[length];
		
		System.out.println("enter the array data : ");
		Utility.enterArrayInt(arr);
		
		Utility.insertionSort(arr);
		
		Utility.printArray(arr);
		
		
	}

}