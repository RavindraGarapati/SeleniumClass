package com.java.numbers;

import java.util.HashSet;

public class DistinctCharactersInString_MyImplimintation 
{

	public static void main(String[] args)
	{
		
		String str = "RAVINDRA";
		char[] strChar = str.toCharArray();
		//System.out.println(strChar);
		
		HashSet<Character> charSet = new HashSet<Character>();
		
		for(char c : strChar)
		{
			charSet.add(c);
		}
		
		String sNew = "";
		
		for(char c : charSet)
		{
			sNew = sNew + c;
		}
		
		System.out.println(sNew);
	}

}
