package com.bridgelab.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelab.utility.Utility;

public class ReplaceStringTemplate {
	
	public static String replaceUserName(String name)
	{
		String template="Hello <<UserName>>,how are you?";
		
		Pattern p=Pattern.compile("..UserName..");
		Matcher m=p.matcher(template);
		String newtemplate=m.replaceAll(name);
		return newtemplate;
	}
	
	public static boolean checkFormat(String name)
	{
		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
		
		if(name.length()<3 || pattern.matcher(name).matches()==true)
		{
			return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
		System.out.println("Hello <<UserName>>,how are you?");
		System.out.print("enter your name : ");
		String name= Utility.readString();
		
		if(!checkFormat(name))
		{
			System.out.println("not a valid name");
			return;
		}
		
		System.out.println(replaceUserName(name));
		
		Utility.closeScanner();
	}
}
