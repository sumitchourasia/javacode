package com.bridgelab.algorithm;

import com.bridgelab.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("enter the length of array");
		int length=Utility.readInt();
		int[] arr=new int[length];
		
		Utility.enterArrayInt(arr);
		
		Utility.doBubbleSort(arr);
		
		Utility.printArray(arr);
		
		Utility.closeScanner();
		
	}

}



