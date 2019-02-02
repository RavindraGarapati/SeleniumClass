package com.java.numbers;

import java.util.LinkedHashSet;

public class RepeatedCharactersInString_MyImplimintation {

	public static void main(String[] args)
	{
		String str = "RAVINDRA";
		String newStr = "";
		
		char[] strChar =  str.toCharArray();
		
		LinkedHashSet<Character> linked = new LinkedHashSet<Character>();
		
		for(int i=0; i<strChar.length; i++)
		{
			for(int j=i+1; j<strChar.length; j++)
			{
				if(strChar[i] == strChar[j])
				{
					linked.add(strChar[i]);
					break;
				}
			}
		}
		
		for(char c : linked)
		{
			newStr = newStr+c;
		}
		
		System.out.println("Repated Characters: "+newStr);
	}

}
