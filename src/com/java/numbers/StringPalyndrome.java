package com.java.numbers;


public class StringPalyndrome
{

	public static void main(String args[])
	{
		
		String name = "abca";
		//System.out.println("Original Name: "+name);
		String nameRev = "";
		int lengthOfName = name.length();
		
		for(int i=lengthOfName-1; i>=0; i--)
		{
			char eachCharacter = name.charAt(i);
			nameRev = nameRev + eachCharacter;
		}
		//System.out.println("After Reverse: "+nameRev);
		
		if(name.equalsIgnoreCase(nameRev))
		{
			System.out.println("Palyndrome");
		}
		else
		{
			System.out.println("Not a Palyndrome");
		}
	}
	

}
