package com.bridgelab.algorithm;

import java.io.*;
import java.util.Arrays;

import com.bridgelab.utility.Utility;

public class BinarySearchWords {
	
	public static boolean binarySearch(String[] arr,String word)
	{
		
		
		
		
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("enter the file name : ");
		String filename=Utility.readString();
		
		Utility.writeLineIntoFilePW(filename);
		String line=Utility.readlineFromFile(filename);
		
		String[] arr=line.split(",");
		
		Utility.sortStringArray(arr);
		
		System.out.println(" sorted array is : "+Arrays.toString(arr));
		
		System.out.print("enter the word to look for : ");
		String word=Utility.readString();
		binarySearch(arr,word);
		
		Utility.closeScanner();
		
	}
}
