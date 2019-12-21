package main.java.functional;

import main.java.utility.*;

public class SumOfThreeIntegers {

	public static int findSumZero(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0 && arr[i] != arr[j] && arr[j] != arr[k] && arr[k] != arr[i]) {
						count++;
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}

				}
			}
		}
		return count;
	}

	
	public static void main(String[] args) {
		int length = 0;
		System.out.println("enter the length of the array ");
		length = InputScanner.readInt();
		int[] arr = new int[length];

		System.out.println("enter the array ");

		Utility.enterArrayInt(arr);

		System.out.print(" result :  " + findSumZero(arr));

		Math.pow(10, 2);
	}
}
