package com.java.strings;

public class CountCharacterOccurence
{
	public static void main(String[] args)
	{
		// Without using Loops
		
		String str = "Ravindra Garapati";
		String strNew = str.toLowerCase();
		
		int count = strNew.length() - strNew.replace("a", "").length();
		
		System.out.println("Number of occurances of 'a' in "+strNew+" = "+count);

	}

}
