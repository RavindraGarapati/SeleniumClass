package com.java.strings;

public class CountCharacterOccurence2
{
	public static void main(String[] args)
	{
		// Using Loops
		
		String str = "Ravindra Garapati";
		String strNew = str.toLowerCase();
		
		int count=0;
		for(int i=0; i<strNew.length();i++)
		{
			if(strNew.charAt(i) == 'a')
			{
				count++;
			}
		}
		System.out.println("Number of occurances of 'a' in "+strNew+" = "+count);
	}

}
