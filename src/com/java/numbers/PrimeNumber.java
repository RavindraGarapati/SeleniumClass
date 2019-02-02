package com.java.numbers;


public class PrimeNumber
{
	public static void main(String[] args)
	{
		//Printing prime numbers till 100
		int n;
		int i;
		for(n=2; n<=100;n++)
		{
			for(i=2; i<n; i++)
			{
				if(n%i == 0)
				{
					break;
				}
			}
			if(i==n)
			{
				System.out.println(n+" is Prime Number");
			}
		}
	}

}
