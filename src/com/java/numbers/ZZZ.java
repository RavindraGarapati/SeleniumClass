package com.java.numbers;

public class ZZZ
{

	public static void main(String[] args)
	{
		
		String str = "ravindra";
		String distinct = "";
		char charArray[] = str.toCharArray();
		
		for(int i=0; i<charArray.length; i++)
		{
			for(int j=i+1; j<charArray.length; j++)
			{
				if(charArray[i] == charArray[j])
				{
					distinct = distinct+charArray[i];
				}
			}
		}
		System.out.println(distinct);
	}

}
