package com.java.numbers;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural Number: ");
		int N=sc.nextInt();
		sc.close();

		int Sum = 0;
		
		for(int i=1;i<=N;i++)
		{
			Sum = Sum+i;
		}
		System.out.println(Sum);
		
	}

}
