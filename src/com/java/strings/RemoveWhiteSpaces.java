package com.java.strings;

public class RemoveWhiteSpaces
{
	public static void main(String[] args)
	{
		//1. Using replace() methods
		String str = "  My name      is Ravindra ";
		String strNew1  = str.replace(" ", "");
		System.out.println(strNew1);

		//2.Using replaceAll() Method
		String strNew2 = str.replaceAll("\\s", "");
		System.out.println(strNew2);
		
		//3. Without Using replaceAll() Method
		char[] charArray = str.toCharArray();
		StringBuffer sbf = new StringBuffer();
		for(int i=0; i<charArray.length; i++)
		{
			if(charArray[i] != ' ' && charArray[i] != '\t')
			{
				sbf.append(charArray[i]);
			}
		}
		System.out.println(sbf);
	}

}
