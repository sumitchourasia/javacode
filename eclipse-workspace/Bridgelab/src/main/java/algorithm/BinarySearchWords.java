package main.java.algorithm;
import main.java.utility.*;
import java.io.*;
import java.util.Arrays;

import main.java.utility.InputScanner;

public class BinarySearchWords {
	
	public static boolean binarySearch(String[] arr,String word)
	{
		
		
		
		
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("enter the file name : ");
		String filename=InputScanner.readString();
		
		Utility.writeLineIntoFilePW(filename);
		String line=Utility.readlineFromFile(filename);
		
		String[] arr=line.split(",");
		
		Utility.sortStringArray(arr);
		
		System.out.println(" sorted array is : "+Arrays.toString(arr));
		
		System.out.print("enter the word to look for : ");
		String word=InputScanner.readString();
		binarySearch(arr,word);
		
	}
}
