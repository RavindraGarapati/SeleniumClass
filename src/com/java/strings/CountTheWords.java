package com.java.strings;

import java.util.Scanner;

public class CountTheWords
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
	    String str=sc.nextLine();
		//String str = "  My Name is Ravindra  ";
		String[] words = str.trim().split(" ");
		System.out.println("Number of words in the string = "+words.length);
	}

}
