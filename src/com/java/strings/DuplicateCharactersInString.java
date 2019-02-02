package com.java.strings;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString
{
	public static void main(String[] args)
	{
		String str = "Ravindra";
		String strNew = str.toLowerCase();
		
		char[] charArray = strNew.toCharArray();
		
		HashMap<Character, Integer> charHash = new HashMap<Character, Integer>();
		
		for(char c : charArray)
		{
			if(charHash.containsKey(c))
			{
				charHash.put(c, charHash.get(c)+1);
			}
			else
			{
				charHash.put(c, 1);
			}
		}
		
		Set<Character> charSet = charHash.keySet();
		
		for(char c : charSet)
		{
			if(charHash.get(c) > 1)
			{
				System.out.println(c+" : "+charHash.get(c));
			}
		}


	}
}
