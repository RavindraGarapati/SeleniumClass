package com.java.numbers;

public class NumberPalyndrome
{
	public static void main(String args[])
	{
		int numberGiven = 121;
		// We are manipulating 'numberGiven', that's why storing in a temp to validate later
		int temp = numberGiven;
		int reverseNumber = 0;
		int remainder = 0;
		
		do
		{
			remainder = numberGiven % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			numberGiven = numberGiven / 10;
		}while(numberGiven>0);
		
		System.out.println("Temp: "+temp);
		System.out.println("Temp: "+reverseNumber);
		
		if(temp == reverseNumber)
		{
			System.out.println("Number is palyndrome");
		}
		else
		{
			System.out.println("Number is NOT palyndrome");
		}
	}
}
