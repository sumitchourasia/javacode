package main.java.basic;
import main.java.utility.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		String name= InputScanner.readString();
		
		if(!checkFormat(name))
		{
			System.out.println("not a valid name");
			return;
		}
		
		System.out.println(replaceUserName(name));
	}
}
