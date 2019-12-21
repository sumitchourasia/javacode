package main.java.algorithm;

import main.java.utility.*;

public class ReverseWordsOfSentence {

	public static void main(String[] args) {
	
				
				System.out.println("enter the string : ");
				String string=InputScanner.nextLine();
				String revstring="";
				String[] arr=string.split(" ");
				
				for(int i=0;i<arr.length;i++)
				{
					String word = arr[i];
					String rev="";
					char[] charr=new char[word.length()];
					for(int j=0;j<word.length();j++)
					{
						charr[charr.length-1-j]=word.charAt(j);
						rev=charr[charr.length-1-j]+rev;
					}
				    revstring=revstring + " " + rev;
					
				}
				
				System.out.println(revstring);
				
				}





	}


