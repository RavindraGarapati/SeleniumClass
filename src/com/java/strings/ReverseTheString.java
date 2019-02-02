package com.java.strings;

public class ReverseTheString
{
	public static void main(String[] args)
	{
		
		String str = "MyyM";
		
		//1. Using StringBuffer Class
		StringBuffer sbf = new StringBuffer(str);
		System.out.println("Revers of given string: "+sbf.reverse());
		
		//2. Using iterative method
		char[] charArray = str.toCharArray();
		String strRev = "";
		for(int i=charArray.length-1; i>=0; i--)
		{
			strRev = strRev+str.charAt(i);
		}
		System.out.println("Revers of given string: "+strRev);
		
		//3. Checking whether given string is Palyndrome
		if(str.equalsIgnoreCase(strRev))
		{
			System.out.println("Palyndrome");
		}
		else
		{
			System.out.println("Not a Palyndrome");
		}
	}
 
}
